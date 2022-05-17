package learningJv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class firstdbConnection {
    public static void main(String[] args) {
        try{
            //step 1: loading the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");


            //step 2: creating the conncetion object
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","oracle"
            );

            //step 3: creating the statement object
            Statement stmt = con.createStatement();

            //step 4: executing the query
            ResultSet rs = stmt.executeQuery("select * from emp");
            while(rs.next())
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));


            //step 5: close the connection object
            con.close();


        }catch (Exception e){

        }
    }
}
