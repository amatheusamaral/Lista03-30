package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio24 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço de fábrica do veículo: ");
        double precoFabrica = scanner.nextDouble();
        
        double lucroDistribuidor = precoFabrica * 0.28;
        
        double impostos = precoFabrica * 0.45;
        
        double precoFinal = precoFabrica + lucroDistribuidor + impostos;
        
        System.out.println("Preço final do veículo: " + precoFinal);
    }
}