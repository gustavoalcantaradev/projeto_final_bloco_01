package model_repository;

import model.Produto;

public interface ProdutoRepository {
	
	public void criarProduto(Produto produto);
	public void listaProdutos();
	public void deletarProduto(int id);
	public void consultarProduto(int id);


}
