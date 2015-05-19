package br.unipe.cc.testparaJUnit;

public class ContaCorrente {

	private String numero;
	private double saldo;

	public ContaCorrente(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return getNumero()+" - "+getSaldo();
}
}
