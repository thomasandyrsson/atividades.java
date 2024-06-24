package questao04;

public class Pikachu extends Pokemon{
    private int intensidadeDoPoderDoChoqueDoTrovão;

    //Construtor do pokemon Pikachu
    public Pikachu (int faseEvolucao, String type, int intensidadeDoPoderDoChoqueDoTrovão){
        super(faseEvolucao, type);
        this.intensidadeDoPoderDoChoqueDoTrovão = intensidadeDoPoderDoChoqueDoTrovão;
    }

    //Getters e Setters
    public int getIntPoder() {
        return intensidadeDoPoderDoChoqueDoTrovão;
    }

    public void setIntPoder(int intensidadeDoPoderDoChoqueDoTrovão) {
        this.intensidadeDoPoderDoChoqueDoTrovão = intensidadeDoPoderDoChoqueDoTrovão;
    }

    //Evolução de Pikachu
    public void evoluir(){
        System.out.println("\n===== EVOLUINDO... =====");

        faseEvolucao += 1;

        System.out.printf("Pikachu evoluiu para a evolução %d (Raichu) a partir de um pedaço de pedra de evolução", getFaseEvolucao());
    }
}
