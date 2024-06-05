package br.uece.atividade1.questao06;

public class Compra {
    public static void main(String[] args) {
        Venda venda = new Venda(12596, 149.90, 49.90);/*Para iniciarmos o
        nosso programa primeiro atribuimos o tipo da nossa variável. Atribuímos a variável venda que vai re-
        ceber os parâmetros da classe Venda e dizemos que uma nova variável deste tipo será criada, junto
        com os valores atribuídos */
        
        venda.setValorDesconto(49.90);/*Aqui chamamos o método set junto com o valor que que-
        remos */

        venda.exibirDetalhes();/*Apenas imprime */
    }
}