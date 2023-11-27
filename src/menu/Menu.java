package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, ano;
		String modelo, cor;
		
		String carro = "GOl, ano 2000 ,cor azul";
		
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                     GUSTACAR                        ");
		System.out.println("                                                     ");
		System.out.println("            1 - ADICIONAR CARRO                      ");
		System.out.println("            2 - LISTAR TODOS OS CARROS               ");
		System.out.println("            3 - APAGAR CARRO do estoque              ");
		System.out.println("            4 - COMPRAR CARRO                        ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
		opcao = leia.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Adicionar Carro ao estoque");
			
			System.out.println("\nDigite o modelo do Carro: ");
			modelo = leia.next();
			System.out.println("\nDigite o ano: ");
			ano = leia.nextInt();
			System.out.println("\nDigite a cor: ");
			cor = leia.next();
			break;
		
		case 2 : 
			
			System.out.println("Listar todo o estoque");
			
			System.out.println("Carro do nosso estoque: " +carro);
			break;
			
		case 3:
			
			System.out.println("Apagar carro do estoque");
			break;
			
		case 4:
			System.out.println("Comprar carro");
			break;
			default:
				System.out.println("Opção invalida");
			
			
			
			
			
		}
		
		
	}

}
