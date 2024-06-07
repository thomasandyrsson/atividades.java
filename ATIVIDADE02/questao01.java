// 1) Faça os passos a seguir utilizando a linguagem Java: (10 pontos)
// Passo i) Crie uma classe chamada Produto com os seguintes atributos: nome (string),
// tipo (string) e valor (double). Os atributos devem ter visibilidade public. Defina um
// construtor com parâmetros para instanciar os atributos na criação do objeto.
// Passo ii) Em seguida crie uma classe Main de execução e instancie DOIS objetos da classe
// Produto

// Nova classe e atributos criados

import javax.imageio.spi.ImageReaderSpi;

public class Produto{
    public String nome;
    public String tipo;
    public Double valor;

// Construtor
    Produto (String nome, String tipo, String valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

// Buscar o nome
    public String getNome(){
        return nome;
    }

// Buscar o tipo
    public String getTipo(){
        return tipo;
    }

// Buscar o preço
    public Double getPreco(){
        return preco;
    }
}

// Show details
    public static void imprimeProduto(){
        System.err.printf("NOME: ", getNome);
        System.out.printf("TIPO: ", getTipo);
        System.out.printf("PREÇO: ", getPreco);
    }

public static void main (String[] args){
    Produto produto = new Produto ("Teclado", "Informática", "69.90");
    Produto produto2 = new Produto ("Mouse", "Informática", "39.90");

    Produto.imprimeProduto();
}