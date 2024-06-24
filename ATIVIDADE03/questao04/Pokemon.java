package questao04;

public class Pokemon {
    protected int faseEvolucao;
    protected String type;

    public Pokemon(int faseEvolucao, String type){
        this.faseEvolucao = faseEvolucao;
        this.type = type;
    }

    public int getFaseEvolucao() {
        return faseEvolucao;
    }

    public void setFaseEvolucao(int faseEvolucao) {
        this.faseEvolucao = faseEvolucao;
    }

    public void evoluir(){
        System.out.println("===== EVOLUINDO... =====");

        faseEvolucao += 1;

        System.err.printf("O Pokémon evoluiu para a fase %d", getFaseEvolucao());
    }
}