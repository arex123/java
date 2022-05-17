package com.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class genericservlet extends GenericServlet {


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("this is servlet using generic servlet");
        servletResponse.setContentType("text/type");
        PrintWriter out = servletResponse.getWriter();
        out.print("hi this is from generic servlet");
    }
}
