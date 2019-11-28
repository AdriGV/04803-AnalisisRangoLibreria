/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;


import org.japo.java.libraries.UtilesPrimitivos;
/**
 *
 * @author CicloM
 */
public final class App {


   

    public final void launchApp() {
        System.out.println("ANÁLISIS DE RANGO");
        System.out.println("=================");
        int valor;

 
        valor = UtilesPrimitivos.analizarRango(UtilesPrimitivos.NUM, 
                UtilesPrimitivos.MIN, UtilesPrimitivos.MAX);
       
             switch (valor){
            case 0:
                System.out.println(UtilesPrimitivos.MSG_ANA + "DENTRO");
                break;
            case 1: 
                System.out.println(UtilesPrimitivos.MSG_ANA +
                        "FUERA ( Abajo )");
                break;
            case 2:
                System.out.println(UtilesPrimitivos.MSG_ANA + 
                        "FUERA ( Arriba )");
        }
    

    

    

    
    }
   
}
