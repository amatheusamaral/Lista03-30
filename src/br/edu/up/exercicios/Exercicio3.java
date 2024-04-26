package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("salário do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();
        
        double salarioFinal = salarioFixo + (totalVendas * 0.15);
        
        System.out.println("Vendedor: " + nomeVendedor);
        System.out.println("Salário Fixo: " + salarioFixo);
        System.out.println("Salário Final: " + salarioFinal);
    }

  
}
