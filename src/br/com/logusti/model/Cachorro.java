package br.com.logusti.model;

public class Cachorro {
	
	public String nome; 
	public Integer idade;
	public Float comprimentoDePelosEmCentimetros;
	public String corDosPelos;
	public String corDosOlhos;
	public Float peso;
	
	
	@Override
	public String toString(){
		
		return new StringBuilder()
				.append("\nNome: ")
				.append(nome)
				.append("\nIdade: ")
				.append(idade)
				.append("\nCor dos Pelos: ")
				.append (corDosPelos)
				.append("\nPeso: ")
				.append(peso)
				.toString();
		
	}	
	
}
