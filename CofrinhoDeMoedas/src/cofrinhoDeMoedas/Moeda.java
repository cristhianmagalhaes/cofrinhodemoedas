package cofrinhoDeMoedas;

import java.util.Objects;

public abstract class Moeda {

	private double valor;

	public Moeda(double valor) {//construtor da classe já solicitando o valor da moeda
		this.valor = valor;
	}
	//métodos get e set da variável valor
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
	public boolean equals(Object obj) {//método equals, utilizado para comparação de objetos na remoção de moedas
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

	public abstract double converter();//método abstrado para ser implantado nas classes filhas
	
	

}
