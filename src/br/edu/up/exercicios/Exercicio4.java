package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("valor da cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.print("quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();
        
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        
        System.out.println("Valor em Reais: R$" + valorEmReais);
    }

   
}
