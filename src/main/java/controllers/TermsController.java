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
        req.setAttribute("disciplinesByTerm", disciplinesBySTerm);
        if (selectedTermId == null) {
            req.setAttribute("selectedTerm", terms.get(0));
            List<Discipline> disciplinesInSemestr = DBManager.getDisciplinesInSemestr(terms.get(0).getId()+"");
//////        req.setAttribute("disciplinesInSemestr",disciplinesInSemestr);
        } else {

        }
        DBManager.getDisciplinesInSemestr(terms.get(0).getId() + "");
        req.setAttribute("terms", terms);
        req.getRequestDispatcher("/WEB-INF/jsp/terms.jsp").forward(req, resp);
    }
}


//
//
////
////
//////        String idSem = req.getParameter("idSem");
//////

////    }
////
////    @Override
////    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.doPost(req, resp);
////    }
////}