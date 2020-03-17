package br.com.collection04;

import java.util.ArrayList;
import java.util.List;

import br.com.collection04.Cachorro;
import br.com.collection04.Gato;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}

	private void start() {
		
		Cachorro primeiroCachorro = new Cachorro("Tibursinho");
		primeiroCachorro.setCor("azul");
		Cachorro segundoCachorro = new Cachorro("Aroldo");
		
		Gato primeiroGato = new Gato();
		primeiroGato.setNome("Yoru");
		Gato segundoGato = new Gato("vermelho");
		segundoGato.setNome("chupetinha");
		
		List<Animal> ListaDeAnimais = new ArrayList<Animal>();
		ListaDeAnimais.add(primeiroCachorro);
		ListaDeAnimais.add(segundoCachorro);
		ListaDeAnimais.add(primeiroGato);
		ListaDeAnimais.add(segundoGato);
		
		
		for (Animal animal : ListaDeAnimais) {
			animal.som();
			animal.dizerMeuNome();
			
			if(animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gato.oQueFacoDuranteANoite();
			}else {
				Cachorro cachorro = (Cachorro)animal;
				cachorro.oQueEuGostoDeFazer();
			}
		}
		
	}

}
