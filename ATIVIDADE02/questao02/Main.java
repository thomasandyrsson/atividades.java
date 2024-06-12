package questao02;
import java.util.Scanner;

class Main {

    public static void main(String[] args){

    //Chamando Scanner e variáveis
        Scanner leia = new Scanner(System.in);
        String nomeDaPessoa;
        int idadeDaPessoa;
        double alturaDaPessoa;

    //Criando objeto p1
        Pessoa p1 = new Pessoa();

    //Setando pessoa
        System.out.println("\n>> DIGITE O NOME A SER GUARDADO: ");
        nomeDaPessoa = leia.nextLine();
        p1.setNome(nomeDaPessoa);

        System.out.println("\n DIGITE A IDADE: ");
        idadeDaPessoa = leia.nextInt();
        p1.setIdade(idadeDaPessoa);

        System.out.println("\n DIGITE A ALTURA: \n");
        alturaDaPessoa = leia.nextDouble();
        p1.setAltura(alturaDaPessoa);

    //Imprimindo p1
        p1.printDados();
    
    //Close scanner
    leia.close();
    }
        
}

