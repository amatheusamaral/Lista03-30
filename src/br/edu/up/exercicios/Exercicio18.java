package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio18 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);
        
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();
        
        double abono;
        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else { // Sexo feminino
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }
        
        double salarioLiquido = salarioFixo + abono;
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido acrescido do abono: " + salarioLiquido);
    }
}