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
public class exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Define a quantidade de questões
        System.out.print("Digite a quantidade de questões da prova: ");
        int n = leitor.nextInt();

        char[] gabarito = new char[n];
        char[] respostasAluno = new char[n];
        int acertos = 0;

        //Lê o Gabarito Oficial
        System.out.println("--- Cadastro do Gabarito ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = leitor.next().toUpperCase().charAt(0);
        }

        // Lê as Respostas do Aluno
        System.out.println("\n--- Respostas do Aluno ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Resposta da questão " + (i + 1) + ": ");
            respostasAluno[i] = leitor.next().toUpperCase().charAt(0);
        }

        // Compara os Vetores
        for (int i = 0; i < n; i++) {
            if (gabarito[i] == respostasAluno[i]) {
                acertos++;
            }
        }

        // Resultado Final
        System.out.println("\n--- Resultado Final ---");
        System.out.println("Total de acertos: " + acertos);
        double nota = ((double) acertos / n) * 100;
        System.out.printf("Desempenho: %.2f%%\n", nota);

        leitor.close();
    }
}