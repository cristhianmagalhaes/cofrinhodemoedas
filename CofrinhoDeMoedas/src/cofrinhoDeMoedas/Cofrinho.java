package cofrinhoDeMoedas;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<>();//instância do arraylist do tipo moeda
	
	public void adicionar(Moeda moeda) {//método que adiciona as moedas ao arraylist
		listaMoedas.add(moeda);//o método add faz parte da classe ArrayList
	}
	
	public void remover(Moeda moeda) {//método que remove as moedas do arraylist
		boolean retorno = listaMoedas.remove(moeda);//o método remove faz parte da classe ArrayList
		if(retorno == true) {//estrutura de condição que verifica se a moeda escolhida está no arraylist
			System.out.println("** MOEDA REMOVIDA COM SUCESSO **");
		} else {
			System.out.println("** A MOEDA ESCOLHIDA NÃO ESTÁ NO COFRINHO **");
		}
	}
	
	public void listar() {//método para listar as moedas do cofrinho
		if(listaMoedas.isEmpty()) {//estrutura de condição que verifica se a lista está vazia
			System.out.println("** O COFRINHO ESTÁ VAZIO **");
		} else {
			for (Moeda moeda : listaMoedas) {//estrutura de repetição que lista as moedas
				System.out.println(moeda.toString() + moeda.getValor());
			}
		}
		
	}
	
	public double somarTotal() {//método para soma do total dos valores das moedas
		double total = 0;
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();//iteração do total com a chamada do método de converção para real
		}
		return total;
	}

}
