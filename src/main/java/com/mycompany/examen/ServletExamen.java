/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-107
 */
@WebServlet(name = "ServletExamen", urlPatterns = {"/Resultados"})
public class ServletExamen {
    
protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre= request.getParameter("nombre");
        String calificacion=request.getParameter("calificacion");
String ip= request.getRemoteAddr();

 Evaluacion e=new Evaluacion();
           e.setNombre("Ana");
           e.setCalificacion( 7.0f);
           }}
