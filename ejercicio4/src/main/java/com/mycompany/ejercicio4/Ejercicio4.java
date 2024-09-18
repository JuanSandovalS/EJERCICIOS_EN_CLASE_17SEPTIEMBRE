/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author JUAN
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       int numero = 1;
        
        while (numero <= 10) {
            System.out.println("Tabla del " + numero);
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
                i++;
            }
            System.out.println();  // Espacio entre tablas
            numero++;
        }
    }
}
