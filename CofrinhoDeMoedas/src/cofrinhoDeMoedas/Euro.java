package cofrinhoDeMoedas;

public class Euro extends Moeda{

	public Euro(double valor) {//construtor da classe j� solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//m�todo para converter valor para real com a cota��o do dia 22/06/23
		
		return this.getValor() * 5.23;
		
	}

	@Override
	public String toString() {//m�todo "info()" para apresenta��o das moedas na lista
		return "Euro - �";
	}

}
