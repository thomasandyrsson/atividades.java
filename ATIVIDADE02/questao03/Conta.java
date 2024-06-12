/*

 






Passo iv) Após o laço de repetição, faça uma estrutura de 
decisão para verificar o saldo. Caso ele esteja positivo, escreva na tela “Saldo Final Positivo” seguido 
do valor do saldo final. Caso contrário, escreva “Saldo Final Negativo” seguido do valor do saldo final. 

*/
package questao03;

public class Conta {
/*Passo i) Crie uma classe chamada Conta, considerando que esta deva possuir: Número, Agência, Tipo e 
Saldo. Os atributos devem ter visibilidade private. */    
    private int conta;
    private int agencia;
    private String tipo;
    private double saldo;
    private double valorDoSaque;

/*Encapsule os atributos criando métodos SETs e GETs.  */
    public int getConta(){
        return conta;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

/*Crie um construtor com parâmetro para inicializar os atributos no momento da criação dos objetos */

    Conta (int agencia, int conta, String tipo, double saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

/*Crie um método público para decrementar o saldo.  */ 

    public void saqueValor(double valorDoSaque){
        this.valorDoSaque = valorDoSaque;
        double novoValor = saldo - valorDoSaque;
            setSaldo(novoValor); 
    }

    public void consultaSaldo(){
        // System.out.println("\n SEU SALDO É: " + saldo);
        System.out.printf("\n| SEU SALDO É: %.2f", saldo);
    }
}