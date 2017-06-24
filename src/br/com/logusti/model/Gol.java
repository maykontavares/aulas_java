package br.com.logusti.model;

public class Gol extends Carro {
	
	public Gol(){
		marca = "Volks";
		nome = "Gol";
	}
	
	@Override
	public void acelerar(){
		
		System.out.println("Acelando o Golzao muito doido");
	}
	
}
