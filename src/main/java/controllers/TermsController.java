package controllers;

import database.DBManager;
import entity.Discipline;
import entity.Term;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TermsController", urlPatterns = "/terms")
public class TermsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String selectedTermId = req.getParameter("selectedTermId");

        List<Term> terms = DBManager.getAllActiveTerms();
        req.setAttribute("terms", terms);

        if (selectedTermId == null) {
            req.setAttribute("selectedTerm", terms.get(0));
            List<Discipline> disciplinesBySelectedTerm = DBManager.getDisciplinesInTerm(terms.get(0).getId() + "");
            req.setAttribute("disciplinesByTerm", disciplinesBySelectedTerm);
        } else {
            for (Term term : terms) {
                String TermId = term.getId() + "";
                if (TermId.equals(selectedTermId)) {
                    req.setAttribute("selectedTerm", term);
                    List<Discipline> disciplinesBySelectedTerm = DBManager.getDisciplinesInTerm(term.getId() + "");
                    req.setAttribute("disciplinesByTerm", disciplinesBySelectedTerm);
                }
            }
        }
        req.getRequestDispatcher("/WEB-INF/jsp/terms.jsp").forward(req, resp);
    }
}
