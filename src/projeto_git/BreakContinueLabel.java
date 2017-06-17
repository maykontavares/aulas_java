package projeto_git;

public class BreakContinueLabel {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			} else if (i == 4) {
				break;
			}
			System.out.println("contator: " + i);
		}
		System.out.println("fim de execucao");
	}
	
	
}
