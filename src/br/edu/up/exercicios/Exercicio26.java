package br.edu.up.exercicios;
import java.util.Scanner;

public class Exercicio26 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o grupo de risco (Baixo = 1, Médio = 2, Alto = 3): ");
        int grupoRisco = scanner.nextInt();
        
        if (idade < 17 || idade > 70) {
            System.out.println("Desculpe, a idade do pretendente não se enquadra nas faixas permitidas.");
            return;
        }
        
        int categoria;
        if (idade >= 17 && idade <= 20) {
            categoria = grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            categoria = grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            categoria = grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            categoria = grupoRisco + 3;
        } else {
            categoria = grupoRisco + 6;
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Grupo de risco: " + grupoRisco);
        System.out.println("Categoria: " + categoria);
        
        scanner.close();
    }


}
