/*Crie a seguinte estrutura de Herança usando a linguagem Java: (20 pontos)
– Classe Pokemon (Classe MÃE)
• Tipo (eletrico, fofo, agua, terra, ar, …)
• Fase da evolução (Fase 1, Fase 2, Fase 3, ...)
– Classe Pikachu (Classe Filha)
• Intensidade do choque de trovão
– Classe Charmander (Classe Filha)
• Intensidade do jato de fogo
Faça com que as classes Pikachu e Charmander herdem de Pokemon usando a palavra extends.
Crie um método na classe MAE chamado evoluir(), para imprimir que o pokemon está evoluindo para a próxima
 fase.
Sobrescreva o método evoluir na classe filha Pikachu para informar que ele irá evoluir a partir de uma 
pedra.
Em cada método evoluir (original e sobrescrito), altere o atributo fase de evolução.
Inicialize os atributos de cada classe Pikachu e Charmander e depois chame o método evoluir de cada uma 
delas. Ao final, imprima na tela a fase atual de cada Pokemon. */
package questao04;

public class Main {
    public static void main(String[] args) {
    //Instanciar novo Pokémon Pikachu
        Pikachu pikachu = new Pikachu(1, "Elétrico", 38);
    
    //Evoluir Pikachu para Raichu
        pikachu.evoluir();

    //Em que fase atual esta Pikachu
        System.out.printf("\nRaichu evoluiu de Pikachu; é um pokémon que se encontra na fase de evolução nº %d", pikachu.getFaseEvolucao());

    // Instanciando novo pokemon do tipo Fogo Charmander
        Charmander charmander = new Charmander(1, "Fogo", 48);
        
    //imprime evolução
        charmander.evoluir();

    //Em que fase atual esta Charmander
        System.out.printf("\nCharmellion evoluiu de Charmander; é um pokémon que se encontra na fase de evolução nº %d", charmander.getFaseEvolucao());

    }
    
}
