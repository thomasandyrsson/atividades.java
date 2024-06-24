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
