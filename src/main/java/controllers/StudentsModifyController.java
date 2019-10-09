package controllers;


import database.DBManager;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentsModifyController", urlPatterns = "/studentsModify")

public class StudentsModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idSt = req.getParameter("iDmodifSt");
        Student student = DBManager.getStudentById(idSt);
        req.setAttribute("student", student);
        req.getRequestDispatcher("WEB-INF/jsp/studentsModify.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String newName = req.getParameter("newName");
        String newSurname = req.getParameter("newSurname");
        String newGroup = req.getParameter("newGroup");
        String newData = req.getParameter("newData");
        String idSt = req.getParameter("idSt");
        DBManager.modifyStudent(newSurname, newName, newGroup, newData, idSt);
        resp.sendRedirect("/students");
    }
}

