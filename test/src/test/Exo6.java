package test;

public class Exo6 {
	
	static void Divisible (int A) {
		
		if ( A % 5 == 0 && A% 11 == 0) {
			System.out.println ("Est divisible par 5 et par 11");
		}
		else {
			
			System.out.println ("Pas divisible par 5 et par 11" );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divisible(30);
		Divisible(0);
		Divisible(55);
		Divisible(-55);
		Divisible(-1);
		
	}

}
