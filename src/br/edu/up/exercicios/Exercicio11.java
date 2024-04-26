package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio11 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 0; i < 56; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);
            
            if (sexo == 'M') {
                totalHomens++;
                System.out.println(nome + " é homem");
            } else if (sexo == 'F') {
                totalMulheres++;
                System.out.println(nome + " é mulher");
            } else {
                System.out.println("Sexo inválido! Digite M para masculino ou F para feminino.");
                i--; 
            }
        }
        
        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);
    }

}
