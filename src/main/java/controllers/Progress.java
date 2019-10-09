package controllers;

import database.DBManager;
import entity.Marks;
import entity.Student;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Progress", urlPatterns = "/progress")
public class Progress extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idSt = req.getParameter("idSt");
        Student student = DBManager.getStudentById(idSt);
        List<Term> terms=DBManager.getAllActiveTerms();
        Term selectedTerm=terms.get(0);
        List<Marks> marks=DBManager.getMarksByStudentTern ( idSt,  selectedTerm.getId());
        req.setAttribute("term",terms);
        req.setAttribute("student",student);
        req.setAttribute("mark", marks);
        req.setAttribute("selectedTerm", selectedTerm);
        req.getRequestDispatcher("/WEB-INF/jsp/studentProgress.jsp").forward(req, resp);
    }
}
