package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteMetodoSemParametro {

	public static void main(String[] args) throws Exception {
		
		Class<?> subControleClasse = Class.forName("br.com.alura.alurator.playground.controle.SubControle");
	
		Constructor<?> construtorPadrao = subControleClasse.getDeclaredConstructor();
		construtorPadrao.setAccessible(true);
		
		Object subControle = construtorPadrao.newInstance();
	
		for (Method m : subControleClasse.getMethods()) {
			System.out.println(m);
		}
		
		System.out.println();
		
		Method metodo2 = subControleClasse.getDeclaredMethod("metodoSubControle2");
		metodo2.setAccessible(true);
		System.out.println(metodo2.invoke(subControle));
		
		Method metodo1 = subControleClasse.getDeclaredMethod("metodoSubControle1");
		metodo1.setAccessible(true);
		System.out.println(metodo1.invoke(subControle));
		
	}
	
	
}
