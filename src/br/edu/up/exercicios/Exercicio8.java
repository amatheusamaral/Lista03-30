package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        String mencao;
        if (media >= 7) {
            mencao = "Aprovado";
        } else if (media <= 5) {
            mencao = "Reprovado";
        } else {
            mencao = "Recuperação";
        }
        
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Menção: " + mencao);
    }

}
