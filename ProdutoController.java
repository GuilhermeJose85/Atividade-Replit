package Controller;

import Model.Produto;

public class ProdutoController {
    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        System.out.println("Produto cadastrado com sucesso: " + produto.getNome());
    }

    public void mostrarProduto(Produto produto) {
        System.out.println("Produto: " + produto.getNome() + " | Preço: R$ " + produto.getPreco());
    }
}
