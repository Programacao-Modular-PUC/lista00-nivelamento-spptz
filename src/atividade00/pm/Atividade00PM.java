/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade00.pm;

/**
 *
 * @author glbra
 */

import java.util.Scanner;


public class Atividade00PM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int x = leitor.nextInt();

        long fatorial = 1; //para numeros grandes
        for (int i = 1; i <= x; i++) {
            fatorial *= i;
        }
        System.out.println( "Fatorial de " + x + " é: " + fatorial);
        
        leitor.close();
    }
}
