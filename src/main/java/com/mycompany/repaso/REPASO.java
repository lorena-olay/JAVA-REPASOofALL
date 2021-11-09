/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class REPASO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int operador1 = 0, operador2 = 0;
        boolean solicitarDatos = true;
        /*
        - MOSTRAMOS MENÚ OPCIONES
        - FILTRAMOS LAS ENTRADAS DE LOS USUARIOS
        - CONTROLAR LAS EXCEPCIONES POR SI EL USUARIO SE EQUIVOCA
        - CUATRO OPCIONES: SUMAR, RESTAR, MULTIPLICAR Y DIVIDIR
        
         */

        System.out.println("Bienvenidos al calculato:");
        System.out.println("Introduce dos operandos (entre 100 y -100).");
        do {
            System.out.println("Introduce dos operandos (entre 100 y -100).");
        
        
        do{
        try{
            //Bloque de código candidaato a lanzar la excepción
        System.out.println("Introduce operando 1: ");
        operador1 = sc.nextInt();
        System.out.println("Introduce operando 2: ");
        operador2 = sc.nextInt();
        solicitarDatos = false;
        } catch(InputMismatchException ime){
            //Código para tratar el error
            System.out.println("Se ha introducido texto en lugar de números." + 
                    "Vuelve a introducir los ");
            sc.nextLine();
        }
        } while (solicitarDatos); //Bucle que controla la excepción
         
        } while (!((operador1 < 100 && operador1 > -100)
                && (operador2 < 100 && operador2 > -100)));
    }

}
