package cofrinhoDeMoedas;

public class Dolar extends Moeda {

	public Dolar(double valor) {//construtor da classe j� solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//m�todo para converter valor para real com a cota��o do dia 22/06/23
		
		return this.getValor() * 4.79;
		
	}

	@Override
	public String toString() {//m�todo "info()" para apresenta��o das moedas na lista
		return "D�lar - $";
	}

}
