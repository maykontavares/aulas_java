package projeto_git;

public class AndOrNot {
	
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		boolean resultado = a && b;
		//syso
		//System.out.println(resultado);
		
		boolean resultado1 = !a && b;
		//syso
		//System.out.println(resultado1);
		
		boolean resultado2 = !a && !b;
		//syso
		//System.out.println(resultado2);
		
		boolean c = false;
		boolean resultado3 = a && b && c;
		//syso
		//System.out.println(resultado3);
		
		//System.out.println(!(a && b));
		
		//System.out.println(!a && !b);
		boolean resultado4 = !(a &&(b && c));
		//System.out.println(resultado4);
		
		//System.out.println(a || b);
		System.out.println(a || !b);
		boolean resultado5 = (a|| (b ||c));
		
	}
	
}
