/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CicloM
 */
public class UtilesPrimitivos {

    //Scan
    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    //Constantes operación
    public static final int OP_SUM = 0;     // Suma 
    public static final int OP_RES = 1;     // Resta 
    public static final int OP_MUL = 2;     // Producto 
    public static final int OP_DIV = 3;     // Cociente 
    public static final int OP_MOD = 4;     // Resto 
    public static final int OP_MED = 5;     // Media 
    public static final int OP_MAY = 6;     // Mayor 
    public static final int OP_MEN = 7;     // Menor 

    public static final int RANGE_IN = 0; // Dentro de Rango
    public static final int RANGE_BELOW = 1; // Debajo de Rango
    public static final int RANGE_ABOVE = 2; // Encima de Rango

    //Constantes
    public static final int NUM = 0;
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static final String MSG_USR = "Número ......: ";
    public static final String MSG_MIN = "Mínimo ......: ";
    public static final String MSG_MAX = "Máximo ......: ";
    public static final String MSG_ANA = "Análisis ....: ";
    public static final String MSG_ERR = "Error";

    public static final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                break;
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;

            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;

        }

        return result;

    }

    public static final int analizarRango(double num, int min, int max) {
        boolean errorOK = true;
        int valor = 0;
        do {
            try {
                System.out.print(MSG_USR);
                num = SCN.nextInt();
                if (num > min && num < max) {
                    valor = 0;
                } else if (num < min) {
                    valor = 1;
                } else if (num > max) {
                    valor = 2;
                }
                errorOK = false;

            } catch (Exception e) {
                System.out.println(MSG_ERR);
                System.out.println("---");

            } finally {
                SCN.nextLine();
            }
        } while (errorOK);

        System.out.println("---");
        System.out.printf(MSG_MIN + "%d%n", min);
        System.out.printf(MSG_MAX + "%d%n", max);
        System.out.println("---");

        return valor;
    }

}
