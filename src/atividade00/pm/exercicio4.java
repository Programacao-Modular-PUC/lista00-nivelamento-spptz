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


public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);

        // Lê os tamanhos de M e N
        System.out.print("Tamanho do vetor X: ");
        int n = leitor.nextInt();
        System.out.print("Tamanho do vetor Y: ");
        int m = leitor.nextInt();

        int[] x = new int[n];
        int[] y = new int[m];
        int[] z = new int[n + m]; // Tamanho máximo possível
        int contZ = 0;

        // Preenche X e já adiciona em Z
        System.out.println("Digite os elementos de X:");
        for (int i = 0; i < n; i++) {
            x[i] = leitor.nextInt();
            z[contZ++] = x[i];
        }

        // Preenche Y e verifica antes de adicionar em Z
        System.out.println("Digite os elementos de Y:");
        for (int i = 0; i < m; i++) {
            y[i] = leitor.nextInt();

            // Lógica de verificação: se Y já está em Z
            boolean existe = false;
            for (int j = 0; j < contZ; j++) {
                if (y[i] == z[j]) {
                    existe = true;
                    break;
                }
            }

        // Se não existe, adiciona

        if (!existe) {
            z[contZ++] = y[i];
        }
    }
    
    // Exibe União Z
    
    System.out.print("Vetor União Z: [");
    for (int i = 0; i < contZ; i++) {
        System.out.print(z[i] + (i == contZ - 1 ? "" : ", "));
    }
    System.out.println("]");

        leitor.close();
    }
}

