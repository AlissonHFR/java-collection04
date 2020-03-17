package br.com.collection04;

public class Cachorro extends Animal{
	public Cachorro(String nome) {
		setNome(nome);
	}
	@Override
	public void som() {
		System.out.println("Eu gosto de latir");
	}
	
	public void oQueEuGostoDeFazer() {
		System.out.println("Gosto de morder os carteiros");
	}
}
