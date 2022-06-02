package form;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class registerUser extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        String name = req.getParameter("name");
        String role = req.getParameter("role");



        String email = req.getParameter("email");

        String date = req.getParameter("date");
        String age = req.getParameter("age");
        String feeling = req.getParameter("feeling");

        System.out.println("name: "+name+"\n"+"role:"+role+"\n"+"email:"+email+"\n"+"date: "+date+"\n"+"age: "+age+"\n"+"feeling: "+feeling);

        String gender = req.getParameter("gender");

        String description = req.getParameter("desc");
        String course = req.getParameter("crse");
        System.out.println("gender: "+gender+"\n"+"desc: "+description+"\n"+"course:"+course);






        String ConditionAgreed = req.getParameter("terms");


//      validation
        if (ConditionAgreed != null) {
            System.out.println("agreed to condition\n");
        } else {
            out.println("<h2>you must agree to terms and conditions<h2>");
            return;
        }




        res.setContentType("text/html");


        boolean flag = false;

        try {
            Connection con = db.createC();
            String q = "insert into formservlet values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, name);
            ps.setString(2, role);
            ps.setString(3, email);
            ps.setString(4,date);
            ps.setString(5,age);
            ps.setString(6,feeling);
            ps.setString(7,gender);
            ps.setString(8,description);
            ps.setString(9,course);
            ps.executeUpdate();
            flag = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (flag) {
//            out.print("successfully added");

            res.sendRedirect("success.jsp");


        } else {
            out.print("something went wrong");
        }


    }
}
