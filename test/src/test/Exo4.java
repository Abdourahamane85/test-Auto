package test;

public class Exo4 {
	
	static void Bissextile (int A) { 
		
		if (A % 100 == 0 && A % 400 == 0 && A % 4 == 0) {
			
			System.out.println ("est Bissextile");
		
		}
		else {
			System.out.println("pas Bissextile");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bissextile(1984);
		Bissextile(2000);
	}

}
