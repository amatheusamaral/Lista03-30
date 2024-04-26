package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio20 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        double valorHora = salarioMinimo / 8;
        
        double salarioBruto = horasTrabalhadas * valorHora;
        
        double descontoINSS;
        if (salarioBruto <= 250) {
            descontoINSS = 0;
        } else if (salarioBruto <= 500) {
            descontoINSS = salarioBruto * 0.05;
        } else if (salarioBruto <= 1200) {
            descontoINSS = salarioBruto * 0.1;
        } else {
            descontoINSS = salarioBruto * 0.15;
        }
        
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("Valor da Hora Trabalhada: " + valorHora);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}