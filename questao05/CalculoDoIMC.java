package br.uece.atividade1.questao05;

import java.util.Scanner;

public class CalculoDoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Situação do peso
        String situacao;
        if (imc < 20) {
            situacao = "Abaixo do peso";
        } else if (imc >= 20 && imc < 25) {
            situacao = "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            situacao = "Obeso";
        } else {
            situacao = "Obeso Mórbido";
        }

        // Exibindo o resultado
        System.out.println("Seu IMC é: " + imc);
        System.out.println("Situação do peso: " + situacao);

        scanner.close();
    }
}
