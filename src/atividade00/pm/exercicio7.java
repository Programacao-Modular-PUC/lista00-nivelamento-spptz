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
public class exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Vetores de Suporte
        double[] temperaturas = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };
    
    // Leitura de Dados
    for (int i = 0; i < 12; i++) {
        System.out.print("Digite a temperatura média de " + meses[i] + ": ");
        temperaturas[i] = leitor.nextDouble();
    }

    // Inicialização dos Exremos
    double maiorTemp = temperaturas[0];
    double menorTemp = temperaturas[0];
    int indexMaior = 0;
    int indexMenor = 0;

    // Comparação (Desconsiderando Empates)
    for (int i = 1; i < 12; i++) {
        if (temperaturas[i] > maiorTemp) {
            maiorTemp = temperaturas[i];
            indexMaior = i;
        }
        if (temperaturas[i] < menorTemp) {
            menorTemp = temperaturas[i];
            indexMenor = i;
        }
    }

    // Saída Profissional

    System.out.println("\n--- Relatório Anual de Temperaturas ---");
    System.out.printf("Mês de maior temperatura: %s (%.1fºC)\n", meses[indexMaior], maiorTemp);
    System.out.printf("Mês de menor temperatura: %s (%.1fºC)\n", meses[indexMenor], menorTemp);

    leitor.close();
    }
}