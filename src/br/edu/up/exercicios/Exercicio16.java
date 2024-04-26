package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio16 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de funcionários: ");
        int numeroFuncionarios = scanner.nextInt();
        
        System.out.print("Digite o valor do salário mínimo: ");
        double SalarioMinimo = scanner.nextDouble();
        
        double aumentoFolha = 0;
        
        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();
            
            double reajuste;
            if (salario < 3 * SalarioMinimo) {
                reajuste = salario * 0.50;
            } else if (salario >= 3 * SalarioMinimo && salario <= 10 * SalarioMinimo) {
                reajuste = salario * 0.20;
            } else if (salario > 10 * SalarioMinimo && salario <= 20 * SalarioMinimo) {
                reajuste = salario * 0.15;
            } else {
                reajuste = salario * 0.10;
            }
            
            aumentoFolha += reajuste;
            double novoSalario = salario + reajuste;
            
            System.out.println("Reajuste para o funcionário " + (i + 1) + ": " + reajuste);
            System.out.println("Novo salário do funcionário " + (i + 1) + ": " + novoSalario);
        }
        
        System.out.println("Aumento total da folha de pagamento: " + aumentoFolha);
    }
}
