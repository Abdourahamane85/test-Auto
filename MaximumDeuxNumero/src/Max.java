public class MaximumDeuxNumero {

		static void MaxNumero(int entier1, int entier2, int entier3){
			
			if(entier1 > entier2) {
				System.out.println(entier1+" est le maximum");

			}
			else if (entier2 > entier3 ) {
				System.out.println(entier2+" est le maximum");
			}
			else {
				System.out.println(entier3+" est le maximum");
			}
			}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumero(20,10,30);
}
}