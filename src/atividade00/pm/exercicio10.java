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
public class exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[][] vendas = new double[12][4];
        double[] totalSemanas = new double[4];
        double totalAno = 0;
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Entrada de Dados
        for (int i = 0; i < 12; i++) {
            System.out.println("--- Vendas de " + meses[i] + " ---");
            double totalMes = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Semana " + (j + 1) + ": R$ ");
                vendas[i][j] = leitor.nextDouble();
                
                totalMes += vendas[i][j];
                totalSemanas[j] += vendas[i][j];
                totalAno += vendas[i][j];
            }
            // Mostrar total de cada mês
            System.out.printf("Total vendido em %s: R$ %.2f\n\n", meses[i], totalMes);
        }

        // Mostrar total de cada semana no ano
        System.out.println("--- Totais por Semana (Ano Inteiro) ---");
        for (int j = 0; j < 4; j++) {
            System.out.printf("Total da Semana %d: R$ %.2f\n", (j + 1), totalSemanas[j]);
        }

        // Total geral
        System.out.printf("\nTOTAL VENDIDO PELA LOJA NO ANO: R$ %.2f\n", totalAno);

        leitor.close();
    }
}