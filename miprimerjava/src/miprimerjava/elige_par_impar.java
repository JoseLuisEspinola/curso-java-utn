package miprimerjava;

public class elige_par_impar {

	public static void main(String[] args) {

		int desde = 5;
		int hasta = 14;
		boolean muestra = true;      // se debe cambiar a false si se desea mostrar numero impares
		
		while(desde <= hasta) {
			if(desde%2 == 0 && muestra == true) {
				System.out.print(desde);
				System.out.print(", ");
			}
			
			if(desde%2 > 0 && muestra == false) {
				System.out.print(desde);
				System.out.print(", ");
			}
			
			desde = desde + 1;
		}
	}

}
