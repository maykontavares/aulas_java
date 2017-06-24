package br.com.logusti.model;

public class Uno extends Carro {
	
	public Uno(){
		marca = "Fiat";
		nome = "Uno";
	}
	@Override
	public void acelerar(){
		
		System.out.println("Sobe caramba q motor de Dentista");
	}	
}