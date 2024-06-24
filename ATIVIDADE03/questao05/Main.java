/*Crie a seguinte estrutura de Herança usando a linguagem Java: (20 pontos)
– Classe Animal (Classe MÃE)
• Tipo (mamífero, herbívoro, ...)
• Gênero
– Classe Homem (Classe Filha)
• Profissão
– Classe Gato (Classe Filha)
• Raça
Faça com que as classes Homem e Gato herdem de Animal usando a palavra extends.
Crie um método na classe MAE chamado falar(), para imprimir na tela a uma mensagem genérica: “Animal 
falando ...”.
Sobrescreva o método falar() nas classes filhas Homem e Gato. Na classe Homem imprima na tela “Olá boa 
tarde!”. Na classe Gato, imprima “Miau Miau Miaaauuu ...”.
Crie um objeto a1 da Classe Animal e chame o método falar(). Em seguida, instancie o objeto a1 para ser 
da classe Homem e chame novamente o método falar(). Logo após, instancie o objeto a1 para ser da classe 
Gato e chame o método falar(). Verifique que cada método falar() irá imprimir uma mensagem diferente, 
representando a característica do polimorfismo. Ex: Animal a1 = new Animal(); a1.falar(); a1 = new Homem();
 a1.falar(); */
package questao05;

public class Main {

    public static void main(String[] args) {
        //Instanciar novo objeto a1
        Animal a1 = new Animal("Teste", "teste");
        a1.falar();

        //Gato mia
        a1 = new Gato("Mamífero", "Fêmea", "Persa");
        System.out.println("O objeto a1 é um gato e o gato faz: ");
        a1.falar();

        //Sobrescrever gato para ser humano
        a1 = new Homem("Mamífero", "Mulher", "Gerente-geral");

        //Humano fala
        System.out.println("\nAgora o a1 virou uma mulher e ela diz: ");
        a1.falar();
    }
    
}