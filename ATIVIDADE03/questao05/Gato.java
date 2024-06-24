package questao05;

public class Gato extends Animal{
    private String raça;

    /*Sobrescreva o método falar() nas classes filhas Homem e Gato. Na classe Homem imprima na tela 
    “Olá boa tarde!”. Na classe Gato, imprima “Miau Miau Miaaauuu ...”. */
    private void falar(){
        System.err.println("Miau, Miau, Miauuuu ...");
    }
}
