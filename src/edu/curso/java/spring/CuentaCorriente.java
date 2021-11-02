package edu.curso.java.spring;

public class CuentaCorriente implements CuentaBancaria {

	private double saldoActual = 0;
	private double limiteExtra = 1000;

	@Override
	public void ponerPlata(double monto) {
		// TODO Auto-generated method stub
		saldoActual = saldoActual + monto;
	}

	@Override
	public void sacarPlata(double monto) {
		System.out.println("Sacando plata de la CA");
		if (saldoActual - monto + limiteExtra >= 0) {
			saldoActual = saldoActual - monto;
		}
		System.out.println("Monto actual: " + saldoActual);

	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public double getLimiteExtra() {
		return limiteExtra;
	}

	public void setLimiteExtra(double limiteExtra) {
		this.limiteExtra = limiteExtra;
	}

}
