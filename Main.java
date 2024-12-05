//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("coca", "gelada", 10.00);
        Produto p2 = new Produto("cebolitos", "salgadinho", 4.99);
        System.out.println("loja do seu zé");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(p1);
        carrinho.adicionar(p2);
        carrinho.remover("coca");

        Venda v = new Venda(carrinho);
        v.totalPreco();
    }
}