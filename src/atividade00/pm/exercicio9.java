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

/**
     * @param args the command line arguments
     */
public class exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        // Leitura dos 6 números
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = leitor.nextInt();
        }

        System.out.println("\n--- RELATÓRIO ---");

        // Processamento de Pares
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                somaPares += numeros[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);

        // Processamento de Ímpares
        System.out.println("\nOs números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                qtdImpares++;
            }
        }
        System.out.println("Quantidade de ímpares = " + qtdImpares);

        leitor.close();
    }
}