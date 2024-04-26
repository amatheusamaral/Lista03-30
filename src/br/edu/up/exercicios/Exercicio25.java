package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio25 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (em percentual): ");
        double taxaJuros = scanner.nextDouble();
        
        double rendimentoMensal = depositoInicial * (taxaJuros / 100);
        
        double saldoFinal = depositoInicial + 24 * rendimentoMensal;
        
        System.out.println("Saldo final após 24 meses: " + saldoFinal);
    }
}