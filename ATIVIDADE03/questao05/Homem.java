package questao05;

public class Homem extends Animal{
    //Variaveis
    private String profissão;

    //Construtor
    public Homem (String tipo, String gênero, String profissão){
        super(tipo, gênero);
        this.profissão = profissão;
    }
    //Falar humano -- 
    public void falar(){
        System.out.println("Olá boa tarde!");
    }
}
