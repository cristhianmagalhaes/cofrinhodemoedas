package cofrinhoDeMoedas;

public class Real extends Moeda {

	public Real(double valor) {//construtor da classe já solicitando o valor da moeda
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double converter() {//método só retorna o próprio valor, é utilizado na soma do total
		return this.getValor();
		
	}

	@Override
	public String toString() {//método "info()" para apresentação das moedas na lista
		return "Real - R$";
	}

}
