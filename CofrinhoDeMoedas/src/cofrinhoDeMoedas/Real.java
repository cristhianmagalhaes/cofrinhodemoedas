package cofrinhoDeMoedas;

public class Real extends Moeda {

	public Real(double valor) {//construtor da classe j� solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//m�todo s� retorna o pr�prio valor, � utilizado na soma do total
		return this.getValor();
		
	}

	@Override
	public String toString() {//m�todo "info()" para apresenta��o das moedas na lista
		return "Real - R$";
	}

}
