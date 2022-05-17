package servletFirstApp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.http.*;


public class register extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        out.println("<h2>Hi , REGISTER SERVLET</h2>");

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");

        System.out.println("name: "+name+"\n"+ "password: "+password+"\n"+ " email:"+email);

        boolean addedindb = false;
        try{
            Connection con = DatabaseConnection.createC();
            String query = "insert into servletdata(name,password,email) values(?,?,?)";


            //preparing statement
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,password);
            ps.setString(3,email);

            ps.executeUpdate();
            addedindb=true;

        }catch (Exception e){
//            System.out.println("Exception "+e);
            e.printStackTrace();
        }

        if(addedindb){
            out.println("<h2>Account successfully created in database</h2>");
        }else {
            out.println("<h2>something went wrong</h2>");

        }
    }

}
