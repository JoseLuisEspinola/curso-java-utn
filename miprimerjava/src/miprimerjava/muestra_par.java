package miprimerjava;

public class muestra_par {

	public static void main(String[] args) {
		
		int desde = 5;
		int hasta = 14;
		
		while(desde <= hasta) {
			if(desde%2 == 0) {
				System.out.print(desde);
				System.out.print(", ");
			}
			desde = desde + 1;
		}
	}
}
