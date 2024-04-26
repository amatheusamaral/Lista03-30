package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio19 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();
        
        double salarioBruto = horasTrabalhadas * valorHora;
        
        double descontoINSS;
        if (salarioBruto <= 2000) {
            descontoINSS = salarioBruto * 0.1;
        } else if (salarioBruto > 2000 && salarioBruto <= 3000) {
            descontoINSS = salarioBruto * 0.15;
        } else {
            descontoINSS = salarioBruto * 0.2;
        }
        
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto do INSS: " + descontoINSS);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}