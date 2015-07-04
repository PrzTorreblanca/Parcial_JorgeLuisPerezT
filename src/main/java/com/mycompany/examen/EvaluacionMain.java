
package com.mycompany.examen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class EvaluacionMain {
    private static Object HibernateUtilidades;
    private static Object daoe;

    
    public static void main(String[] args) {
        
       SessionFactory factory= Hibernate.getSessionFactory();
      ;
       
       
           Session sesion =     factory.openSession();
          
           Transaction tranza=sesion.beginTransaction();
           
           
           Evaluacion e=new Evaluacion();
           e.setNombre("Mario");
           e.setCalificacion(5.8f);
    
           e.setNombre("José");
           e.setCalificacion(7.4f);
           
           e.setNombre("Roberta");
           e.setCalificacion(8.6f);
           
        
          
    
}}
