package controller;

import java.util.ArrayList;
import java.util.Optional;

import model.Produto;
import model_repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;
	
	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("O Carro "+ produto.getModelo()+ " foi adicionado ao estoque!");
	}

	@Override
	public void listaProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void deletarProduto(int id) {
		Optional<Produto> opProduto = buscarNaCollection(id);
		if (opProduto.isPresent()) {
			if (listaProdutos.remove(opProduto.get()) == true) {
				System.out.println("Produto deletado");
			}
		} else {
			System.out.println("Produto não encontrado");
		}
		
	}


	@Override
	public void consultarProduto(int id) {
		Optional<Produto> opProduto = buscarNaCollection(id);
		if (opProduto.isPresent()) {
			opProduto.get().visualizar();
		} else {
			System.out.println("O Produto do id:  " + id + " não foi cadastrado");
		}
		
	}
	
	public int gerarId() {
		return ++ id;
	}
	public Optional<Produto> buscarNaCollection(int id) {
		
		for (var produto : listaProdutos) {
			if (produto.getId() == id) {
				return Optional.of(produto);
			}
		}
		return Optional.empty();
	
	
	}
}
