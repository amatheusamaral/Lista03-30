package br.edu.up.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida pelo automóvel: ");
        double distanciaTotal = scanner.nextDouble();
        
        System.out.print("Digite o total de combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = distanciaTotal / combustivelGasto;
        
        System.out.println("Consumo médio do automóvel: " + consumoMedio);
    }


}

