/*

Crie uma classe Java para representar uma Televisão no qual deverá armazenar a situação da televisão, se ela 
encontra-se ligada ou desligada e o canal atual. Essa classe deverá ainda oferecer os seguintes comportamentos:

.ligaTv() – muda a situação da TV para ligada;

.desligaTv() – muda a situação da TV para desligada;

.proximoCanal() – muda o canal para o próximo canal, sabe-se que a TV tem somente até o canal 100. Ou seja, 
caso esteja no canal 100 e seja requisitado o próximo canal, este deverá voltar para o canal 1.

.canalAnterior() – muda o canal para o canal anterior, sabe-se que a TV inicia os canais do canal 1, ou seja, 
caso esteja no canal 1 e seja requisitado o canal anterior, este deverá ir para o canal 100.

A classe Televisão deverá conter um construtor vazio que inicia a TV na situação de desligada e no canal 1.

*/
package br.uece.atividade1.questao08;

class Televisão {
    /* Criação dos dois objetos a serem trabalhados */
    String tvOnOff;
    int canalTv;
/* Colocar a televisão por padrão desligada no canal 1 */
    public Televisão (){
        tvOnOff = "Desligado";
        canalTv = 1;
    }
//Get TvOff
    public String getTvOnOFF(){
        return tvOnOff;
    }
    // Ligar a tv
    public void ligaTv(){

         if(tvOnOff.equals("Desligado")){ //usei o equals por se tratar de uma string
            tvOnOff = "Ligado";
            System.out.println("A TV ESTÁ LIGADA");
         } else if(tvOnOff.equals("Ligado")){
            System.out.println("A TV JÁ ESTÁ LIGADA");
         }
         
    }
// desligar tv
    public void desligaTv(){

        if(tvOnOff.equals("Ligado")){
            tvOnOff = "Desligado";
            System.out.println("A TV ESTÁ DESLIGADA");
        } else if(tvOnOff.equals("Desligado")){
            System.out.println("A TV JÁ ESTÁ DESLIGADA");
        }
    }
// retornar o canal anteriormente instaurado
    public int canalTv(){
        return canalTv;
    }
// proximo canal e regra dos canais 1 a 100. Usei o if simples
    public int proximoCanal(){
        if(canalTv < 100){
            canalTv += 1;
        }else if(canalTv == 100){
            canalTv -= 99;
        }return canalTv;
        
    }
// canal anterior
    public int canalAnterior(){
        if(canalTv > 1){
            canalTv -= 1;
        }else if(canalTv == 1){
            canalTv += 99;
        }
        return canalTv;
    }
// mostrar os deatlhes dos status da tv
    public void showDetails(){
        System.out.println("A TELEVISÃO ESTÁ " + tvOnOff);
        System.out.println("A TV ESTÁ NO CANAL " + canalTv);
    }
}