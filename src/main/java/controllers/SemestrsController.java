//package controllers;
//
//import database.DBManager;
//import entity.Discipline;
//import entity.Term;
//import entity.Term;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet(name = "SemestrsController", urlPatterns = "/semestrs")
//public class SemestrsController extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("semestrs",semestrs);
//        List<Term> semestrs = DBManager.getAllActiveSemestrs();
//        String selectedTermId=req.getParameter("selectedTermId");
//
//        if (selectedTermId==null){
//            req.setAttribute("selectedTerm", semestrs.get(0));
//            DBManager.getDisciplinesInSemestr(semestrs.get(0).getId()+"");
//
//            req.setAttribute("disciplinesByTerm", disciplinesBySTerm);
//        }
//        else {
//
//        }
//
//
//
//
////        String idSem = req.getParameter("idSem");
////        List<Discipline> disciplinesInSemestr = DBManager.getDisciplinesInSemestr(idSem);
////        req.setAttribute("disciplinesInSemestr",disciplinesInSemestr);
//        req.getRequestDispatcher("/WEB-INF/jsp/semestrs.jsp").forward(req,resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//    }
//}
