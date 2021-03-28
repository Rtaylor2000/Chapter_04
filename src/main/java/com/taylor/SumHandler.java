/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taylor;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryan
 */
@WebServlet(name = "SumHandler", urlPatterns = {"/SumHandler"})
public class SumHandler extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SumModel sumModel = new SumModel();
	String firstNumber = "";
        String secoundNumber = "";
        
        firstNumber = request.getParameter("firstNumber");
        secoundNumber = request.getParameter("secondNumber");
        sumModel.setAnswer(firstNumber, secoundNumber);
        
        request.setAttribute("sumModel", sumModel);
        request.getRequestDispatcher("/AddTwo.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

        /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        SumModel model = new SumModel();
//	String firstNumber = "";
//        String secoundNumber = "";
//        
//        firstNumber = request.getParameter("firstNumber");
//        secoundNumber = request.getParameter("secondNumber");
//
//        model.setAnswer(firstNumber, secoundNumber);
//
//        request.getRequestDispatcher("/AddTwo.jsp").forward(request, response);
        processRequest(request, response);
    }
    
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
