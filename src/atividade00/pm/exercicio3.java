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


public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);

        //Lê a quantidade de alunos (n)
        System.out.print("Digite a quantidade de alunos (n): ");
        int n = leitor.nextInt();

        int[] prog = new int[n];
        int[] model = new int[n];

        //Preenche o vetor de programação
        System.out.println("Digite as matrículas de Programação:");
        for (int i = 0; i < n; i++) {
            prog[i] = leitor.nextInt();
        }

        //Preenche o vetor de modelagem
        System.out.println("Digite as matrículas de Modelagem:");
        for (int i = 0; i < n; i++) {
            model[i] = leitor.nextInt();
        }

        //Calcula a Interseção
        System.out.println("Alunos matriculados em ambas as UCs:");
        for (int i = 0; i < n; i++) {
            for (int j = 0;j < n; j ++){
                if (prog[i] == model[j]) {
                    System.out.println(prog[i]);
                    break; //Para de procurar no segundo vetor se já achou
                }
            }
        }

        leitor.close();
    }
}