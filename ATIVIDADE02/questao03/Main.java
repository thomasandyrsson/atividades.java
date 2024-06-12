package questao03;

public class Main {
    public static void main(String[] args) {

/*Passo ii) Em seguida crie uma classe Main de execução e 
instancie um objeto chamado c1 da Classe Conta passando os valores por parâmetro no construtor. 
Ex: Conta c1 = new Conta(123, 456, "Corrente", 550.32); */

        Conta c1 = new Conta(1041, 42965-8, "Corrente", 1412.98);
        c1.consultaSaldo();
        
/*Passo iii) Ainda na classe Main, faça um laço de repetição para decrementar 10 vezes o saldo com valores 
aleatórios entre 0 e 100 para simular saques e pagamento de contas. Para os valores aleatórios entre 0 
e 100, pode-se usar: Math.random() * 100.0.  */
        
        for(int i = 0; i < 10; i++){
            double saque = Math.random() * 100.0;
            c1.saqueValor(saque);            
        }
        c1.consultaSaldo();
    }
}
