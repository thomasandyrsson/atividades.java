// Passo i) Crie uma classe chamada Pessoa com os seguintes atributos: nome (string), idade (inteiro) e 
// altura (double). Os atributos devem ter visibilidade private. Encapsule os atributos criando métodos 
//SETs.
// Crie um método público chamado printDados para imprimir na tela, usando System.out.println, os atributos 
//  de um objeto pessoa.
// Passo ii) Em seguida crie uma classe Main de execução e instancie um objeto chamado p1 da classe Pessoa.
// Passo iii) Leia as informações da Pessoa pelo teclado utilizando a classe Scanner e atribua os valores 
// lidos para os atributos do objeto p1 criado usando os métodos SETs. Passo iv) Escreva na saída padrão os 
// atributos do objeto pessoa usando o método printDados.
package questao02;

class Pessoa {

// Criar atributos da classe Pessoa
    private String nome;
    private int idade;
    private double altura;

// Usando o método Set para inserir nome, idade e altura
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

// Método para imprimir os dados da pessoa
    public void printDados(){
        System.out.println("Nome da pessoa >> " + nome);
        System.out.println("\nIdade da pessoa >> " + idade);
        System.out.println("\nAltura da pessoa >> " + altura);
    }
}
