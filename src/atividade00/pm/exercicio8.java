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
public class exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double[] precos = new double[10];
        int[] quantidades = new int[10];
        double valorGeralVendas = 0;

        // Entrada de Dados
        for (int i = 0; i < 10; i++) {
            System.out.println(" --- Objeto" + (i + 1) + " ---");
            System.out.print("Preço Unitário: R$ ");
            precos[i] = leitor.nextDouble();
            System.out.print("Quantidade Vendida: ");
            quantidades[i] = leitor.nextInt();
        }

        // Relatório de Vendas
        System.out.println("\n--- Relatório de Vendas ---");
        int maiorQtd = -1;
        int posicaoMaisVendido = -1;

        for (int i = 0; i < 10; i++) {
            double valorTotalObjeto = precos[i] * quantidades[i];
            valorGeralVendas += valorTotalObjeto;

            System.out.printf("Item %d: Qtd: %d | Unitário: R$ %.2f | Total: R$ %.2f\n", 
                               (i + 1), quantidades[i], precos[i], valorTotalObjeto);

            // Verifica o mais vendido
            if (quantidades[i] > maiorQtd) {
                maiorQtd = quantidades[i];
                posicaoMaisVendido = i;
            }
        }

        // Totais e Comissão
        double comissao = valorGeralVendas * 0.05;
        System.out.println("\n--- RESUMO MENSAL ---");
        System.out.printf("Valor geral das vendas: R$ %.2f\n", valorGeralVendas);
        System.out.printf("Valor da comissão (5%%): R$ %.2f\n", comissao);
        System.out.printf("Salário total do vendedor: R$ %.2f\n", (545.00 + comissao));

        // Objeto mais vendido
        System.out.println("\n--- DESTAQUE ---");
        System.out.printf("Objeto mais vendido: R$ %.2f (Posição no vetor: %d)\n", 
                           precos[posicaoMaisVendido], posicaoMaisVendido);

        leitor.close();
    }
}