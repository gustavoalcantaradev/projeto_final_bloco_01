package menu;

import java.io.IOException;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController Produto = new ProdutoController();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao, ano, valor;
		String modelo, cor, tipo;
		int id;
		
		
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                     GUSTACAR                        ");
		System.out.println("                                                     ");
		System.out.println("            1 - ADICIONAR CARRO                      ");
		System.out.println("            2 - LISTAR TODOS OS CARROS               ");
		System.out.println("            3 - APAGAR CARRO DO ESTOQUE              ");
		System.out.println("            4 - CONSULTAR POR ID                     ");
		System.out.println("            5 - SAIR                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");
		opcao = leia.nextInt();		

		
		if (opcao == 5) {
			System.out.println("\nVOLTE SEMPRE!!!");
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		
		case 1:
			System.out.println("Adicionar Carro ao estoque");
			
			System.out.println("Informe a placa do carro:");
			id = leia.nextInt();
			System.out.println("\nDigite o modelo do Carro: ");
			modelo = leia.next();
			System.out.println("\nDigite o ano: ");
			ano = leia.nextInt();
			System.out.println("\nDigite a cor: ");
			cor = leia.next();
			System.out.println("Digite o valor do carro: ");
			valor = leia.nextInt();
			keyPress();
			break;
		
		case 2 : 
			
			System.out.println("Nosso estoque");
			
			keyPress();
			
			break;
			
		case 3:
			
			System.out.println("Apagar carro do estoque");
			keyPress();
			break;
			
		case 4:
			System.out.println("Comprar carro");
			keyPress();
			break;
			default:
				System.out.println("Opção invalida");
			
			
			
			
		}	
		}
	
		
	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para Continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter");
		}
	}

}
