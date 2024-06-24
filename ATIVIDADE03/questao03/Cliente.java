package questao03;

//Classe cliente herda de Pessoa
public class Cliente extends Pessoa{

//Variáveis privados para uso apenas da classe atual
    private String idCliente;

//Construtor
    public Cliente (String nome, int idade, String cpf, String idCliente){

//Chamada construtor da classe-mãe
        super(nome, idade, cpf);
//Variável cliente
        this.idCliente = idCliente;
    }

//Método imprime dados
    public void imprimeDados() {
        System.out.println("=======================");
        System.out.printf("\nNOME: %s \nIDADE: %d \nCPF: %s \nID DO CLIENTE: %s", nome, idade, cpf, idCliente);
    }
}