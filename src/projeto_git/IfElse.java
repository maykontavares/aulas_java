package projeto_git;

public class IfElse {

	//main
	public static void main(String[] args) {
		int idade = 12;
		idade = 5;
		if (idade >= 18 && idade <=65){
			//syso
			System.out.println("O convidao pode entrar na festa");
		} else if(idade > 65){
			if (idade> 120){
				System.out.println("enterra que esta morto ");
			} else {
			System.out.println("ligar pro aliso");
			}
		} else {
			System.out.println( "Chama a puliça");
		}	
		System.out.println("Fim da execuçao do programa");
	}
	
	
}
