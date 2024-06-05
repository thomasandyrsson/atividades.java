package br.uece.atividade1.questao06;

// Nova classe

class Venda {
    
    public int código;

    private double valorTotal;
    
    protected double valorDesconto;

//Construtor
/*Aqui temos o construtor. Nele receberemos os valores a serem trabalhados. */
    public Venda(int código, double valorTotal, double valorDesconto){

        this.código = código;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
    }

//Getters e Setters do Valor Desconto Métodos de instancia

    protected double getValorDesconto(){/*Aqui retornamos o valo de desconto. Basicamente, ele 'recupera'
    o valor de desconto que havia sido trabalhado anteriormente no construtor */

        return valorDesconto; 

    }
    
    protected void setValorDesconto(double valorDesconto){/*Essa linha recebe uma entrada double e não 
        gera uma saída, por isso o 'void' foi aplicado.*/

            if(valorDesconto >= 0 && valorDesconto <= valorTotal){/*Essa linha é uma condicional adicional
                que não permite que o valor do desconto seja menor que 0, afinal não existe desconto nega-
                tivo. */

            this.valorDesconto = valorDesconto;/*Aqui se a condicional for "true" então atribui o double
            recebido em setValorDesconto na variável double valorDesconto */

        } else {

            System.err.println("O desconto atual não se aplica");

            }
        }
    

////Getters e Setters do ValorTotal (Métodos de instancia)

    public double getValorTotal(){/*Aqui nesta linha 'retornamos o valor', digamos que estamos iniciando-o
    para que ele possa ser modificado e trabalhado */

        return valorTotal;
    }

    public void setValorTotal(double valorTotal){/*Aqui nesta linha recebemos o valor de valorTotal e esse
        método não gera uma saída void */

        if(valorTotal >= 0){

            this.valorTotal = valorTotal;/*atribui e modifica o valorTotal */

        }
        
        else {

            System.out.println("O valor atual não é válido");

        }
        
    }

//Métodos para cálculo de vendas

    public double calcularValorTotal(){/*Esse método calcula o novo valor do desconto. Neste caso
        ele é responsável apenas pelo cálculo e o retorno do resultado desse cálculo pelo tipo double */

        return valorTotal - valorDesconto;
    }

    public void exibirDetalhes(){
        /*Apenas imprime o que se pede */
        System.out.println("CÓDIGO DA VENDA :" + código);
        System.out.println("VALOR DO DESCONTO :" + valorDesconto);
        System.out.println("VALOR TOTAL DA COMPRA :" + valorTotal);
        System.out.println("TOTAL COM DESCONTO :" + calcularValorTotal());

    }

}