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


public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de x, y e z:");

        //lê os valores

        int x = leitor.nextInt();
        int y = leitor.nextInt();
        int z = leitor.nextInt();
    
        //guarda no vetor

        int[] vetor = {x, y, z};

        //calcula maior e menor

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
            }
        
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);

            //verifica o intervalo [y, z]

            if (x >= y && x <= z) {
                System.out.println("O número " + x + " está dentro do intervalo [y,z].");
            } else {
                System.out.println("O número " + x + " está fora do intervalo [y,z]."); 
            }

            //testa divisibilidade por y e z

            if (x % y == 0 && x % z == 0) {
                System.out.println("x é divisível por y e z.");
            } else if (x % y == 0) {
                System.out.println("x não é divisivel por y e por z simultaneamente.");
            }
        
            
        leitor.close();
    }
}