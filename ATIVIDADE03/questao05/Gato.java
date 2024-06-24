package questao05;

public class Gato extends Animal{
    private String raça;

    //Construtor
    public Gato (String tipo, String gênero, String raça){
        super(tipo, gênero);
        this.raça = raça;
    }
    /*Sobrescreva o método falar() nas classes filhas Homem e Gato. 
    Na classe Gato, imprima “Miau Miau Miaaauuu ...”. */
    public void falar(){
        System.err.println("Miau, Miau, Miauuuu ...");
    }
}
