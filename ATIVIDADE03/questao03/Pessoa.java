package questao03;

//Classe Pessoa
public class Pessoa {

//Atributos protegidos para uso de classes herdeiras
    protected String nome;
    protected int idade;
    protected String cpf;

//Construtor non-default
    public Pessoa (String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}