package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio17 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        double novoSalario = salarioAtual * (1 + 0.10);
        
        double aumentoFolha = novoSalario - salarioAtual;
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + aumentoFolha);
        System.out.println("Novo salário: " + novoSalario);
        
        double aumentoTotalFolha = aumentoFolha * 584;
        System.out.println("Aumento total na folha de pagamento: " + aumentoTotalFolha);
    }
}