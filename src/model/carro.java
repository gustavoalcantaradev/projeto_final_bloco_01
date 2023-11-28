package model;

public class carro extends Produto{
	
	private String tipo;

	public carro(String modelo, String cor, int ano, int valor, String tipo) {
		super(modelo, cor, ano, valor, valor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo: " + this.tipo);
	}
}
