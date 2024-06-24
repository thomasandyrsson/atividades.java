package questao04;

public class Pokemon {
    protected int faseEvolucao;
    protected String typePokemon;

    public Pokemon(int faseEvolucao, String typePokemon){
        this.faseEvolucao = faseEvolucao;
        this.typePokemon = typePokemon;
    }

    public int getFaseEvolucao() {
        return faseEvolucao;
    }

    public void setFaseEvolucao(int faseEvolucao) {
        this.faseEvolucao = faseEvolucao;
    }

    public String getTypePokemon() {
        return typePokemon;
    }

    public void setTypePokemon(String type) {
        this.typePokemon = type;
    }

    public void evoluir(){
        System.out.println("===== EVOLUINDO... =====");

        faseEvolucao += 1;

        System.err.printf("O Pokémon evoluiu para a fase %d", getFaseEvolucao());
    }
}