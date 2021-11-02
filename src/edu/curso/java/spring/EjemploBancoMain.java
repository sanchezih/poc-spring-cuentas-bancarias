package edu.curso.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EjemploBancoMain {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Banco banco = (Banco) appContext.getBean("banco");
		banco.ponerPlataAUnaCuenta(1000);
		banco.sacarPlataDeUnaCuenta(2000);
	}

}
