package questao04;

public class Main {
    public static void main(String[] args) {
        Agenda a1 = new Agenda(5);
        
        a1.novoContato("Gilmara Matias", "7459854741");
        a1.novoContato("Aldeci Gomes", "785985155");
        a1.novoContato("Marianny Fernandes", "9877451662");
        a1.novoContato("Gabriel Oliveira", "65882544485");
        a1.novoContato("José Florentino", "878541544448");
        a1.novoContato("João Albuquerque", "888774593");
        a1.novoContato("Teste 03", "85585545");

        a1.imprimeContatos();
    }
}
