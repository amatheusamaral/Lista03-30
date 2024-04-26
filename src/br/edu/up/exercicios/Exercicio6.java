package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();
        
        System.out.print("percentual de acréscimo (%): ");
        double percentualAcrescimo = scanner.nextDouble();
        
        double valorVenda = precoCusto * (1 + percentualAcrescimo / 100);
        
        System.out.println("Valor de Venda: " + valorVenda);
    }

}
