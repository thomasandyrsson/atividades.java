package questao04;

public class Agenda {
//Criando vetor
     private Contato[] lista;
     private int quantidade;
     private int contador;

//Construtor
    public Agenda(int quantidade) {
        this.quantidade = quantidade;
        this.contador = 0;
        this.lista = new Contato[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            lista[i] = new Contato();
        }
    }

    //Novo contato

    public void novoContato(String nome, String telefone){
        if(contador < quantidade){
            lista[contador].setNome(nome);
            lista[contador].setTelefone(telefone);
            contador += 1;
        } else{
            System.out.println("NÃO HÁ MAIS ESPAÇO NA AGENDA");
        }
    }

    public void imprimeContatos(){
        for(int i = 0; i < contador; i++){
            
            System.out.printf("\nNOME: %s %n TELEFONE: %s", lista[i].getNome(), lista[i].getTelefone());
        }
    }
}
