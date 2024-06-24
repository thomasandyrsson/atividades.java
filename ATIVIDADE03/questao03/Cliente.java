package questao03;

public class Cliente extends Pessoa{
    String idCliente;
    public Object imprimeDados;

    public Cliente (String nome, int idade, String cpf, String idCliente){
        super(nome, idade, cpf);
        this.idCliente = idCliente;
    }

    public void imprimeDados(){
        System.out.println("=======================");
        System.out.printf("\nNOME: %s \nIDADE: %d \nCPF: %s \nID DO CLIENTE: %s", nome, idade, cpf, idCliente);
    }
}