package edu.curso.java.spring;

public class Banco {
	private CuentaBancaria cuentaBancaria;

	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	
	public void ponerPlataAUnaCuenta(double monto) {
		cuentaBancaria.ponerPlata(monto);
	}
	
	public void sacarPlataDeUnaCuenta(double monto) {
		cuentaBancaria.sacarPlata(monto);
	}
}
