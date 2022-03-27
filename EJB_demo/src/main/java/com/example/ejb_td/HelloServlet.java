package com.example.ejb_td;

import MyBeans.SessionBean;

import java.io.*;
import javax.ejb.EJB;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @EJB
   SessionBean obj;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + obj.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}