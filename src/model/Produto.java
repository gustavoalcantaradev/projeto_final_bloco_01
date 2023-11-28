package model;

public abstract class Produto {

	private String modelo;
	private String cor;
	private int ano;
	private int valor;
	private int id;
	
	
	public Produto(String modelo, String cor, int ano, int valor, int id) {
		super();
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}



	public void visualizar() {
		
		System.out.println("Modelo: " + this.modelo);
		System.out.println("ano: " + this.ano);
		System.out.println("valor: " + this.valor);
		System.out.println("cor: " + this.cor);
	}

	
	

}

