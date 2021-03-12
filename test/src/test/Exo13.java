package test;

public class Exo13 {
	
	static void Depense (double PV, double PA, double Resultat) {
		
	 Resultat = PV - PA;
	
	if (Resultat > 0) {
		System.out.println("Benefice");
	}
	else {
		System.out.println("perte");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Depense(50,40,18) ;
		Depense(50,40,-8) ;
	}

}
