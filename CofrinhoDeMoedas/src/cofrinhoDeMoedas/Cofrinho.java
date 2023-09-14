package cofrinhoDeMoedas;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList<>();//inst�ncia do arraylist do tipo moeda
	
	public void adicionar(Moeda moeda) {//m�todo que adiciona as moedas ao arraylist
		listaMoedas.add(moeda);//o m�todo add faz parte da classe ArrayList
	}
	
	public void remover(Moeda moeda) {//m�todo que remove as moedas do arraylist
		boolean retorno = listaMoedas.remove(moeda);//o m�todo remove faz parte da classe ArrayList
		if(retorno == true) {//estrutura de condi��o que verifica se a moeda escolhida est� no arraylist
			System.out.println("** MOEDA REMOVIDA COM SUCESSO **");
		} else {
			System.out.println("** A MOEDA ESCOLHIDA N�O EST� NO COFRINHO **");
		}
	}
	
	public void listar() {//m�todo para listar as moedas do cofrinho
		if(listaMoedas.isEmpty()) {//estrutura de condi��o que verifica se a lista est� vazia
			System.out.println("** O COFRINHO EST� VAZIO **");
		} else {
			for (Moeda moeda : listaMoedas) {//estrutura de repeti��o que lista as moedas
				System.out.println(moeda.toString() + moeda.getValor());
			}
		}
		
	}
	
	public double somarTotal() {//m�todo para soma do total dos valores das moedas
		double total = 0;
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();//itera��o do total com a chamada do m�todo de conver��o para real
		}
		return total;
	}

}
