package questao05;

public class Animal {
    //Variáveis
    protected String tipo;
    protected String gênero;

    //Construtor
    public Animal(String tipo, String gênero){
        this.tipo = tipo;
        this.gênero = gênero;
    }

    /*Crie um método na classe MAE chamado falar(), para imprimir na tela a uma mensagem genérica:
     “Animal falando ...”. */
    public void falar(){
        System.out.println("Animal falando...");
    }
}