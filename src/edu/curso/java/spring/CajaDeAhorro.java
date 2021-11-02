package edu.curso.java.spring;

public class CajaDeAhorro implements CuentaBancaria {

	private double saldoActual = 0;

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public void ponerPlata(double monto) {
		saldoActual = saldoActual + monto;

	}

	@Override
	public void sacarPlata(double monto) {
		System.out.println("Sacando plata de la CA");
		if (saldoActual - monto >= 0) {
			saldoActual = saldoActual - monto;
		} else {
			System.out.println("No tenes mas plata!!!!!!!!!!!!!!");
		}
		System.out.println("Monto actual: " + saldoActual);

	}

}
