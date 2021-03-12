package test;

public class Exo3 {
	
	static void Pair (int A) {
		
		if (A % 2 == 0 ) {
			System.out.println("est pair");
		}
		else {
			System.out.println("est impair");
		}
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair(100);
		Pair(5);
		Pair(0);
		Pair(-10);
		Pair(1);
	}


}