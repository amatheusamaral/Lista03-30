package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio13 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        int totalAptos = 0;
        
        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scanner.nextInt();
        
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
            
            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            
            System.out.print("Digite a saúde da pessoa (APTO/INAPTO): ");
            String saude = scanner.next().toUpperCase();
            
            if (sexo == 'M' && idade >= 18 && saude.equals("APTO")) {
                totalAptos++;
                System.out.println(nome + " está apto para o serviço militar obrigatório.");
            }
        }
        
        System.out.println("Total de pessoas aptas para o serviço militar obrigatório: " + totalAptos);
    }

 
}
