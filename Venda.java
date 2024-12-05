import java.util.ArrayList;

public class Venda {
    Carrinho carrinho;

    public Venda(Carrinho carrinho){
        this.carrinho = carrinho;
    }

    public void totalPreco(){
        double total = 0;
        ArrayList<Produto> p = carrinho.getProdutos();
        for(int i = 0; i<carrinho.getProdutos().size(); i++){
            total += p.get(i).getPreco();
        }
        System.out.println("o total de compra foi de R$: " + total);
    }
}
