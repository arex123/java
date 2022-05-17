package Aditya.com.student;

import java.net.CookieHandler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
    public static boolean insertStToDB(Student st){
        boolean flag = false;

        try{
            Connection con = DatabaseConnection.createC();
            String query = "insert into students(name,phone,place) values(?,?,?)";

            //prepared statement
            PreparedStatement ps = con.prepareStatement(query); //ps means prepared statement
            //set the value of parameter
            ps.setString(1,st.getSname());
            ps.setString(2,st.getsPhone());
            ps.setString(3,st.getScity());

            //execute
            ps.executeUpdate(); //isse student db mai pahuuch jayega
            flag = true;


        }catch (Exception e){
            System.out.println("Exception while adding: "+e);
        }

        return flag;
    }

    public static boolean deleteUsingId(int userId) {
        boolean flag = false;
        try{
            Connection con = DatabaseConnection.createC();
            String query = "delete from students where id=?";

            //preparedStatement
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,userId);

            //execute
            ps.executeUpdate();
            flag=true;

        }catch (Exception e){
            System.out.println("Exception while deleting: "+e);
        }
        return true;
    }

    public static void showAllStudents() {

        try{
            Connection con = DatabaseConnection.createC();
            String query = "select * from students";

            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);

            while(set.next()){
                System.out.println("ID : "+ set.getInt(1));
                System.out.println("Name : "+set.getString(2));
                System.out.println("Phone : "+set.getString(3));
                System.out.println("Place : "+set.getString(4));

                System.out.println("*****************************************");
            }



        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void setIds() {
        try{
            Connection con = DatabaseConnection.createC();
            String query = "SET @n=0 UPDATE students SET id = @n := @n + 1 ORDER BY id";

            PreparedStatement ps = con.prepareStatement(query); //ps means prepared statement
//            ps.setInt(1,userId);
            ps.executeUpdate();

        }catch (Exception e){
            System.out.println("Exception while updating ids "+e);
        }
    }
}
