package Aditya.com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection con;
    public static Connection createC(){

        try{
            //loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String user = "root";
            String password = "Peter@789";
            String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url,user,password);  //isse hamara connection ban jaayega

        }catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
