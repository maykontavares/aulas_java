package br.com.logusti.model;

public class Carro {

	public String nome;
	public String marca;
	public String modelo;
	
	public void acelerar() {
		String frase = new StringBuilder()
				.append("Acelarando o carro: ")
				.append(nome)
				.append(" - ")
				.append(modelo)
				.toString();
		System.out.println(frase);
	}

	public void virarADireita(){
		String frase = new StringBuilder()
				.append("Virar a Direita: ")
				.append(nome)
				.append(" - ")
				.append(modelo)
				.toString();
		System.out.println(frase);
		
	}
	
	public void viraAEsquerta(){
		String frase = new StringBuilder()
				.append("Virar a Esquerda: ")
				.append(nome)
				.append(" - ")
				.append(modelo)
				.toString();
		System.out.println(frase);
		
	}
	
	public void frear(){
		String frase = new StringBuilder()
				.append("Parar o carro.")
				.append(nome)
				.append(" - ")
				.append(modelo)
				.toString();
		System.out.println(frase);
		
	}
	
	
}