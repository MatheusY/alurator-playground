package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class Executable {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<Controle> controleClass = Controle.class;
		
		Controle controle = new Controle();
		Class<? extends Controle> controleClass2 = controle.getClass();
		
		Class<?> controleClass3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		Controle objeto = controleClass.newInstance();
		Object objeto2 = controleClass3.newInstance();
		
		System.out.println(objeto instanceof Controle);
		
		System.out.println(objeto2 instanceof Controle);
		
	}

}
