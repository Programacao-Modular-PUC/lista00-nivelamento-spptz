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
public class exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int maiorIdade = -1;
        int contEspecifico = 0; // Mulheres, 18-35 anos, olhos verdes, cabelos loiros

        System.out.println("--- Pesquisa Habitacional ---");

        while (true) {
            System.out.print("Digite a idade (ou -1 para sair): ");
            int idade = leitor.nextInt();

            if (idade == -1) break; // Condição de parada

            System.out.print("Sexo (m/f): ");
            char sexo = leitor.next().toLowerCase().charAt(0);

            System.out.print("Cor dos olhos (a-azul, b-verde, c-castanho): ");
            char olhos = leitor.next().toLowerCase().charAt(0);

            System.out.print("Cor dos cabelos (a-loiro, b-castanho, c-preto): ");
            char cabelos = leitor.next().toLowerCase().charAt(0);

            //  Verifica a maior idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            // Critério específico da pesquisa

            if (sexo == 'f' && (idade >= 18 && idade <= 35) && olhos == 'b' && cabelos == 'a') {
                contEspecifico++;
            }
        }

        // Exibição dos resultados
        System.out.println("\n--- Resultado da Pesquisa ---");
        System.out.println("Maior idade encontrada: " + maiorIdade);
        System.out.println("Quantidade de mulheres (18-35 anos, olhos verdes e cabelos loiros): " + contEspecifico);

        leitor.close();
    }
}