package cofrinhoDeMoedas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();//instanciando classe Cofrinho
		
		Scanner teclado = new Scanner(System.in);//instanciando classe Scanner para entradas de usuário
		System.out.println("BEM-VINDO AO COFRINHO DO CRISTHIAN MAGALHÃES PADILHA - RU: 264988");//print inicial do programa
		System.out.println("\n-------------------------");//print do menu principal
		System.out.print("ESCOLHA UMA DAS OPÇÕES:\n"
				+ "1 - Adicionar\n"
				+ "2 - Remover\n"
				+ "3 - Listar\n"
				+ "4 - Calcular total\n"
				+ "0 - Sair\n"
				+ ">>");
		int opcao = teclado.nextInt();//variável que guarda escolha do menu principal
		
		int tipoMoeda=0;//variável que guarda escolha do menu de moedas
		Moeda moeda;//inicializando classe mãe Moeda
		double valor;//inicializando variável que vai guardar os valores das moedas
		
		while(opcao != 0) {//estrutura de repetição while para manter o usuário no menu até a escolha de opção possível
			
			switch (opcao) {//laço switch com a implementação do menu principal
			case 1://menu para adicionar moeda ao cofrinho
				System.out.println("\n-------------------------");
				System.out.println("ESCOLHA A MOEDA:");
				
				while(tipoMoeda > 3 || tipoMoeda <=0) {//estrutura de repetição while para manter o usuário no menu até a escolha de opção possível
					System.out.println("1 - Real (R$)");
					System.out.println("2 - Dólar ($)");
					System.out.print("3 - Euro (€)\n"
							+ ">>");
					tipoMoeda = teclado.nextInt();
				}
				System.out.print("\nDIGITE O VALOR:\n"
						+ ">>");
				valor = teclado.nextDouble();
				
				if(tipoMoeda==1) {//estrutura de condição que instancia a moeda e adiciona o valor conforme as escolhas do usuário no menu anterior
					moeda = new Real(valor);
				} else if(tipoMoeda==2) {
					moeda = new Dolar(valor);
				} else {
					moeda = new Euro(valor);
				}
				cofrinho.adicionar(moeda);//chamada de método para adicionar a moeda ao arraylist
				tipoMoeda = 0;//zerando a variável para a próxima chamada
				break;
			case 2://menu para remover moeda do cofrinho
				System.out.println("\n-------------------------");
				System.out.println("ESCOLHA A MOEDA:");
				
				while(tipoMoeda > 3 || tipoMoeda <=0) {//estrutura de repetição while para manter o usuário no menu até a escolha de opção possível
					System.out.println("1 - Real (R$)");
					System.out.println("2 - Dólar ($)");
					System.out.println("3 - Euro (€)");
					tipoMoeda = teclado.nextInt();
				}
				System.out.println("\nDigite o valor da moeda: ");
				valor = teclado.nextDouble();
				
				if(tipoMoeda==1) {//estrutura de condição que instancia a moeda e adiciona o valor conforme as escolhas do usuário no menu anterior
					moeda = new Real(valor);
				} else if(tipoMoeda==2) {
					moeda = new Dolar(valor);
				} else {
					moeda = new Euro(valor);
				}
				cofrinho.remover(moeda);//chamada de método para remover a moeda do arraylist
				tipoMoeda = 0;//zerando a variável para a próxima chamada
				break;
			case 3://menu para listar todas as moedas do cofrinho
				System.out.println("\n-----------------------------\n"
						+ "MOEDAS QUE ESTÃO NO COFRINHO\n"
						+ "-----------------------------");
				cofrinho.listar();//chamada do método listar
				break;
			case 4://menu para calcular todas as moedas do cofrinho
				System.out.println("\n------------------------------\n"
						+ "TOTAL CONVERTIDO PARA REAL (R$)\n"
						+ "------------------------------");
				System.out.printf("R$%.2f", cofrinho.somarTotal());//print formatado de duas casas decimais com a chamada do método somar
				break;
			default://menu para opção inválida
				System.out.println("\nOpção inválida");
				break;
			}
			System.out.println("\n-------------------------");//menu principal dentro do laço while
			System.out.print("ESCOLHA UMA DAS OPÇÕES:\n"
					+ "1 - Adicionar\n"
					+ "2 - Remover\n"
					+ "3 - Listar\n"
					+ "4 - Calcular total\n"
					+ "0 - Sair\n"
					+ ">>");
			opcao = teclado.nextInt();
			
		}
		
		System.out.println("\n------------------------\n"//print quando sai do programa
				+ "FINALIZANDO PROGRAMA...\n"
				+ "------------------------");

	}

}
