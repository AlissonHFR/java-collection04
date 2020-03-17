package br.com.collection04;

public class Gato extends Animal {
	public Gato() {
		setCor("branco");
	}
	
	public Gato(String cor) {
		setCor(cor);
	}
	
	@Override
	public void som() {
		super.som();
		System.out.println("Eu gosto de miar");
	}
	
	public void oQueFacoDuranteANoite() {
		System.out.println("Eu gosto de pular a cerca toda noite");
	}
}
