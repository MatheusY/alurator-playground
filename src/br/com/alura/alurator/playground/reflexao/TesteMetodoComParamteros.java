package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteMetodoComParamteros {
	
	public static void main(String[] args) throws Exception{
		
		Class<?> controleClass = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
		Constructor<?> constructorPadrao = controleClass.getDeclaredConstructor();
		
		Object controle = constructorPadrao.newInstance();
		
		Method m =controleClass.getDeclaredMethod("metodoControle2", String.class, Integer.class);
		
		m.invoke(controle, "Teste parametros", 2);
	}

}
