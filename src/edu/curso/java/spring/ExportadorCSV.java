package edu.curso.java.spring;

public class ExportadorCSV implements Exportador {

	@Override
	public String exportar(String texto) {
		// TODO Auto-generated method stub
		return "Exportando a CSV el texto: " + texto;
	}

}
