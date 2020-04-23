package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjeto {
	
 public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 Class<SubControle> classSubControle = SubControle.class;
	 Constructor<SubControle> constructor = classSubControle.getConstructor();
	 
	 Constructor<SubControle> constructor2 = classSubControle.getDeclaredConstructor(String.class);
 
	 System.out.println(constructor2);
	 constructor2.setAccessible(true);
	 SubControle subControle = constructor2.newInstance("texto");
	 System.out.println(subControle);
 }
}
