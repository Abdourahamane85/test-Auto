
public class PremiereClasse {
	
	static void MaxNumber(int entier1, int entier2){
	
		
		
		if(entier1 > entier2) {
			System.out.println(entier1+" est le maximum");

		}
		else if (entier1 < entier2) {
			System.out.println(entier2+" est le maximum");
		}
		else {
			System.out.println("les deux nombres sont egaux");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumber(20,10);
		MaxNumber(-1,3);
		MaxNumber(100,200);
		MaxNumber(100,100);
		MaxNumber(-10,-15);
		MaxNumber(+6,-4);
		MaxNumber(0,0);
		MaxNumber(+0,-0);
	}

}

