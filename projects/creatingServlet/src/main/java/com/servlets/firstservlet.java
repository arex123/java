package com.servlets;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class firstservlet implements Servlet{

    //below code is nothing, they are just some of the life cycle method

    ServletConfig conf;


    //when application gets start
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("creating objects:.....");
    }


    //while running application
    public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException{
        System.out.println("Servicing...........");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        out.println("<h1>this is my output from servlet method:</h1>");
//        out.println("<h1>Todays date and time is "+new Date().toString()+"</h1>");
        String var = req.getParameter("name");
        System.out.println("var is here"+var);


        out.println("<h1>this is my output from servlet method:</h1>");



    }


    public void destroy(){
        System.out.println("going to destroy servlet object");
    }


    //now overriding non life cycle method
    public ServletConfig getServletConfig(){
        return this.conf;
    }

    public String getServletInfo(){
        return "this servlet is created by Aditya, by watching durgesh's video ☺";
    }


}
