package questao05;

public class Main {

    public static void main(String[] args) {
        //Instanciar novo objeto a1
        Animal a1 = new Gato("Mamífero", "Fêmea", "Persa");

        //Gato mia
        a1.falar();

        //Sobrescrever gato para ser humano
        a1 = new Homem("Mamífero", "Mulher", "Gerente-geral");

        //Humano fala
        a1.falar();
    }
    
}