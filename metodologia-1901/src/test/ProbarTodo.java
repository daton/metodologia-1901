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
public class ProbarTodo {
    public static void main(String[] args) {
        Opcion op1=new Opcion("El azucar y la harina", true);
        //System.out.println("Tu titulo es "+op1.titulo);
       // System.out.println("Es correcta "+op1.correcta);
       Opcion op2=new Opcion("La grasa", false); 
       Opcion op3=new Opcion("El sol", false);
       Opcion op4=new Opcion("La contaminacion", false);
       Opcion op5=new Opcion("La sal", false);
       
       Opcion[] opciones={op1,op2,op3,op4,op5};
       
Pregunta p1=new Pregunta("Esta es la principal causa del cancer", opciones);

        System.out.println(p1.titulo);
        
        for (Opcion opcion : opciones) {
            System.out.println(opcion.titulo);
        }
       
       
        
    }
}
