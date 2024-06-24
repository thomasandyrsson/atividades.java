package questao04;

public class Charmander extends Pokemon{
    private int intensidadeDoJatoDeFogo;

    Pokemon charmander = new Pokemon(1, "Fogo");

    public Charmander (int faseEvolucao, String type, int intensidadeDoJatoDeFogo){
        super(faseEvolucao, type);
        this.intensidadeDoJatoDeFogo = intensidadeDoJatoDeFogo;
    }

    public int getIntensidadeDoJatoDeFogo() {
        return intensidadeDoJatoDeFogo;
    }

    public void setIntensidadeDoJatoDeFogo(int intensidadeDoJatoDeFogo) {
        this.intensidadeDoJatoDeFogo = intensidadeDoJatoDeFogo;
    }

    public void evoluir(){
        System.out.println("===== EVOLUINDO... =====");

        faseEvolucao += 1;

        System.out.printf("Pikachu evoluiu para a evolução %d a partir de um pedaço de pedra de evolução", charmander.getFaseEvolucao());
    }
}
