//Classe Casa e atribuição

package br.uece.atividade1.questao03;


public class Casa{
    public static void main(String[] args) {
        //Inicio da atribuição da objeto casa de tipo Cidade
        Cidade casa = new Cidade("Icaraí", "Avenida Central", 256);
        //Prints
        System.out.println("INFORMAÇÕES DA RESIDÊNCIA\n");
        System.out.println("A sua casa está no bairro " + casa.bairro);
        System.out.printf("A sua casa fica na rua %s e nº %d", casa.rua, casa.numero);
    }
}
