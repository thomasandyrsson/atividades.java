package br.uece.atividade1.questao02;

class Funcionarios{
    String nome;
    String endereco;
    String telefone;
    String rg;
    String cpf;
    String dataAdmissao;

//Construtor
    public Funcionarios (String nome, String endereco, String telefone, String rg, String cpf, String dataAdmissao){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
    }
    
//métodos adicionais
    void ferias(){
        System.out.printf("O funcionário %s está de férias", nome);
    }

    void falta(){
        System.out.printf("O funcionário %s faltou", nome);
    }

    void rescisão(){
        System.out.printf("O funcionário %s solicitou saída do emprego", nome);
    }
}

