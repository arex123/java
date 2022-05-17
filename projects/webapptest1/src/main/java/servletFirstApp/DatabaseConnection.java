package servletFirstApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection con;
    public static Connection createC(){
        try{
            //loading the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String user = "root";
            String password = "Peter@789";
            String url = "jdbc:mysql://localhost:3306/servletFormData?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url,user,password);

        }catch (Exception e){
//            System.out.println("Exception: "+e);
            e.printStackTrace();
        }
        return con;
    }
}
