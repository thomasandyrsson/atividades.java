public class Main{
    public static void main (String[] args){
        Produto produto = new Produto ("Teclado", "Informática", 69.90);
        Produto produto2 = new Produto ("Mouse", "Informática", 39.90);
    
        produto.imprimeProduto();
        produto2.imprimeProduto();
    }
}

