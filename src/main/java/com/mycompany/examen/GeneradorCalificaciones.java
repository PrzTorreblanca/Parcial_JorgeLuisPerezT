/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

import java.util.ArrayList;
import java.util.List;

public class GeneradorCalificaciones {
 
  public ArrayList<Evaluacion> generarCalificaciones() throws Exception{
        
        ArrayList<Evaluacion> calificaciones = new ArrayList<Evaluacion>();
        Evaluacion e1 = new Evaluacion("Petra", 5.8f);
        Evaluacion e2 = new Evaluacion("Jose", 7.4f);
        Evaluacion e3 = new Evaluacion("Roberta", 8.6f);
        
        calificaciones.add(e1);
        calificaciones.add(e2);
        calificaciones.add(e2);
        
        
    return calificaciones;
    }
    
}
