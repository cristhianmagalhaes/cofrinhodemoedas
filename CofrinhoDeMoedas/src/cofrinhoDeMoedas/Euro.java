package cofrinhoDeMoedas;

public class Euro extends Moeda{

	public Euro(double valor) {//construtor da classe já solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//método para converter valor para real com a cotação do dia 22/06/23
		
		return this.getValor() * 5.23;
		
	}

	@Override
	public String toString() {//método "info()" para apresentação das moedas na lista
		return "Euro - €";
	}

}
