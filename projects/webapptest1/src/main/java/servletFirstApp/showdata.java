package servletFirstApp;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class showdata extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

//        out.print("hello");
        try{
            Connection con = DatabaseConnection.createC();
            PreparedStatement ps = con.prepareStatement("select * from servletdata");

            ResultSet rs = ps.executeQuery();
            out.print("<table width=50% border=1>");
            out.print("<br></br>");
            ResultSetMetaData md = rs.getMetaData();
            int total = md.getColumnCount();

            out.print("<tr>");
            for(int i=1;i<=total;i++){
                out.print("<th>"+md.getColumnName(i)+"</th>");
            }
            out.print("</tr>");

            while (rs.next()){
                out.print("<tr><td>"+rs.getString(1)+"</td><td>"+
                        rs.getString(2)+"</td><td>"+rs.getString(3)+
                        "</td></tr>");
            }
            out.print("</table");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
