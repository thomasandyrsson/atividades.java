/*Escreva um programa em Java que deverá ler da entrada padrão e armazenar em um vetor a altura de 10 pessoas. 
Em seguida, este programa deverá calcular a média e a soma de todos esses valores e apresentar na saída 
padrão. */
package br.uece.atividade1.questao07;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        
//Scanner e variáveis
        Scanner leia = new Scanner (System.in);
        int [] altura = new int [10];
        int soma = 0;
        int media = 0;

//Pegar altura de todos
            for(int i = 0; i < 10; i++){
                System.out.print("Digite a altura (em centímetros) da pessoa " + (i+1) + " >> ");
                altura [i] = leia.nextInt();
            }
//Calcular a soma
            for(int i = 0; i < 10; i++){
                soma += altura [i];
            }
// Calcular a média
            media = soma / 10;
// Imprimir os dados
        System.out.println("A soma dos valores é: " + soma + " cm.");
        System.out.println("A média dos valores é :" + media + "cm.");
// Close scanner
        leia.close();   
    }

}
