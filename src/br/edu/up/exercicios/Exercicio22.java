package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio22 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();
        
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoServico = scanner.nextInt();
        
        double aumento;
        
        if (tempoServico >= 5) {
            aumento = salarioAtual * 0.20;
        } else if (tempoServico >= 3) {
            aumento = salarioAtual * 0.15;
        } else if (tempoServico >= 1) {
            aumento = salarioAtual * 0.10;
        } else {
            aumento = salarioAtual * 0.05;
        }
        
        double novoSalario = salarioAtual + aumento;
        
        System.out.println("Aumento: " + aumento);
        System.out.println("Novo Salário: " + novoSalario);
    }
}