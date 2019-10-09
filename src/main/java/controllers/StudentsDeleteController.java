package controllers;

import database.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentsDeleteController", urlPatterns = "/studentsDelete")
public class StudentsDeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ids = req.getParameter("idsDeleteStudents");
        String[] idsMass = ids.split(",");
        for(String id:idsMass){
            DBManager.deleteStudents(id);
        }
        resp.sendRedirect("/students");
    }
}
