package cofrinhoDeMoedas;

public class Dolar extends Moeda {

	public Dolar(double valor) {//construtor da classe já solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//método para converter valor para real com a cotação do dia 22/06/23
		
		return this.getValor() * 4.79;
		
	}

	@Override
	public String toString() {//método "info()" para apresentação das moedas na lista
		return "Dólar - $";
	}

}
