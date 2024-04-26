package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio21 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        double valorHora = salarioMinimo / 8;
        
        double salarioBruto = horasTrabalhadas * valorHora;
        
        double impostoRenda;
        if (salarioBruto <= 300) {
            impostoRenda = 0;
        } else if (salarioBruto <= 600) {
            impostoRenda = salarioBruto * 0.05;
        } else {
            impostoRenda = salarioBruto * 0.10;
        }
        
        double descontoINSS = salarioBruto * 0.10;
        
        double salarioLiquido = salarioBruto - impostoRenda - descontoINSS;
        
        System.out.println("Valor da Hora Trabalhada: " + valorHora);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Imposto de Renda: " + impostoRenda);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}