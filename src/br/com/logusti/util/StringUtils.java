package br.com.logusti.util;

public class StringUtils {
	
	public void imprimirValorSubstituindoPontoPorVirgula(String valor){
		System.out.println(valor.replace('.',','));
	}
	
	public String trim(String valor){
		return valor.trim();
	}

	public String [] quebrar (String valor, String valorQuebra){
		return valor .split( valorQuebra);
	}
	
	public int quantidade (String valor){
		return valor.length();
	}
	
}
