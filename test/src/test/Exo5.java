package test;

public class Exo5 {
	
	static void Verif (int A) {
		
		if (A > 0) {
			
			System.out.println ("positif");
		}
		else if (A < 0 ) {
			System.out.println("Négatif");
		}
		else {
			System.out.println("Nul");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verif (5);
		Verif (-5);
		Verif(0);
		
	}

}
