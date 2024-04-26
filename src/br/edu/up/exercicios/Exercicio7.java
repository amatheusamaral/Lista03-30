package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio7 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        double custoDistribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;
        double custoConsumidor = custoFabrica + custoDistribuidor + impostos;
        
        System.out.println("Custo ao Consumidor: " + custoConsumidor);
    }

   
}
