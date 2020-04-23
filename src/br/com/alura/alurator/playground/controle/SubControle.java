package br.com.alura.alurator.playground.controle;

public class SubControle extends Controle{

	public SubControle() {}
	
	private SubControle(String texto) {}
	
	public void metodoSubControle1() {
		System.out.println("Executando método subContrule1");
	}
	
	private String metodoSubControle2() {
		System.out.println("Excecutando método subControle2");
		return "retorno do método subControle.metodoSubControle2";
	}
}
