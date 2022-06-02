package form;

import java.sql.Connection;
import java.sql.DriverManager;


public class db {
    static Connection con;

    public static Connection createC() {
        try {


            //loading the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String user = "adlinux";
            String password = "Peter@789";
            String url = "jdbc:mysql://localhost:3306/firstdb?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";

            con = DriverManager.getConnection(url, user, password);

            System.out.println("connect to db " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }


}
