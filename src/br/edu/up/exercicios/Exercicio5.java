package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacoes = valorCompra / 5;
        
        System.out.println("Valor das Prestações: " + valorPrestacoes);
    }

}
