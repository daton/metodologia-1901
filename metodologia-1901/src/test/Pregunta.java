/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author campitos
 */
public class Pregunta {
    String titulo;
    Opcion[] opciones;
    public Pregunta(String x, Opcion[] y){
        titulo=x;
        opciones=y;
    }
}
