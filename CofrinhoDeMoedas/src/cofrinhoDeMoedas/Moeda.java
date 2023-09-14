package cofrinhoDeMoedas;

import java.util.Objects;

public abstract class Moeda {

	private double valor;

	public Moeda(double valor) {//construtor da classe j� solicitando o valor da moeda
		this.valor = valor;
	}
	//m�todos get e set da vari�vel valor
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Moeda - ";
	}

	@Override
	public boolean equals(Object obj) {//m�todo equals, utilizado para compara��o de objetos na remo��o de moedas
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	public abstract double converter();//m�todo abstrado para ser implantado nas classes filhas
	
	

}
