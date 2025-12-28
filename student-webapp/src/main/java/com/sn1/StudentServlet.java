package com.sn1;

import com.sn1.StudentDAO;
import com.sn1.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {
	 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Employee Servlet is WORKING</h2>");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        double salary = Double.parseDouble(req.getParameter("salary"));

        Employee stu = new Employee();
        stu.setName(name);
        stu.setEmail(email);
        stu.setSalary(salary);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
