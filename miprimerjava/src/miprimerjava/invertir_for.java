package miprimerjava;

public class invertir_for {

	public static void main(String[] args) {
		
		int desde = 5;
		int hasta = 14;
				
		for (hasta++; hasta>=desde; hasta=hasta-1) {
			if(hasta%2 == 0) {
				System.out.print(hasta + ", ");
			}
		}
	}
}
