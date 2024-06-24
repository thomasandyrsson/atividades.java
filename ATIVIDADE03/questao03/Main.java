/*Crie a seguinte estrutura de Herança usando a linguagem Java: (20 pontos)
– Classe Pessoa (Classe MÃE)
• Nome
• Idade
• CPF
– Classe Cliente (Classe Filha)
• Id do cliente
Faça com que a classe Cliente herde de Pessoa usando a palavra extends.
Faça uma classe principal e crie um objeto da classe Cliente. Inicialize os atributos do objeto Cliente 
(nome, idade, cpf e id do cliente). Mostre na tela os atributos inicializados. */
package questao03;

public class Main{
    public static void main(String[] args) {
        /*Cliente c1 iniciado */
        Cliente c1 = new Cliente ("João", 26, "125.785.112-85", "8557496");
        
        /*Chamar método de impressão */
        c1.imprimeDados();
    }
}