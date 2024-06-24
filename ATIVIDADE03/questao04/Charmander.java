package questao04;

public class Charmander extends Pokemon{
    private int intensidadeDoJatoDeFogo;

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
        System.out.println("\n===== EVOLUINDO... =====");

        faseEvolucao += 1;

        System.out.printf("Charmander evoluiu para a evolução %d (Charmellion)", getFaseEvolucao());
    }
}
