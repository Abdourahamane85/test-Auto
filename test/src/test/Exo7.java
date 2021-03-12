package test;

public class Exo7 {

	static void Alphabet (char x ) {

		if ((x >= 'A' && x <= 'Z')|| (x >= 'a' && x <= 'z')) {
			System.out.println(x + " est un Alphabet");
			
		}
		else {
			System.out.println(x + " pas un Alphabet");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Alphabet('f');
		Alphabet('5');
		Alphabet('?');
		Alphabet('A');
		Alphabet('/');
		Alphabet('@');
		
		
	}
	

}
