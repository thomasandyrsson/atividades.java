package br.uece.atividade1.questao02;

public class Fabrica {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("João", "Rua José dos Campos", "99999999","999999999-9" , "999.999.999-99", "29/08/2019");
        Funcionarios funcionario2 = new Funcionarios("Marianny", "Avenida Central", "85988887777", "99999999-9", "888.888.888-88", "12/12/2021");
        Funcionarios funcionario3 = new Funcionarios("Gabriel Fonseca", "Rua 3", "8587461236", "2658942149-8", "125.748.965-85", "17/02/2021");
    
        //Print funcionarios
        System.out.println("Informações dos funcionários\n");
        System.out.println("FUNCIONÁRIO 1");
        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Endereço " + funcionario1.endereco);
        System.out.println("Telefone " + funcionario1.telefone);
        System.out.println("CPF: " + funcionario1.cpf);
    }
}
