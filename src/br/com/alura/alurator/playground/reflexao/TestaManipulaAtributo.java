package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Field;

import br.com.alura.alurator.playground.anotacao.NomeTagXml;
import br.com.alura.alurator.playground.modelo.Produto;

public class TestaManipulaAtributo {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Object produto = new Produto("Produto 1", 20.0, "Marca 1");
		Class<?> classe = produto.getClass();
		
		NomeTagXml anotacao = classe.getDeclaredAnnotation(NomeTagXml.class);
		System.out.println(anotacao.value());
		
//		System.out.println(classe.getField("id").get(produto));
		
		for(Field atributo : classe.getDeclaredFields()) {
			atributo.setAccessible(true);
			System.out.println(atributo.getName() + ": " + atributo.get(produto));
		}
		
	}

}
