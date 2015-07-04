/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examen;

/**
 *
 * @author T-107
 */
public class Evaluacion {
    public String nombre;
  public float calificacion;
  
  public Evaluacion(){
 }
  public Evaluacion(String nombre, Float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
  }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }
   
}
