package miprimerjava;

public class Clase1Ejercicio2Correcto {

	public static void main(String[] args) {
	
	int IngresosMes = 489084;
	int CantVehiculos = 3;
	int AntiguedadVeh = 5;
	int CantInmuebles = 3;
	boolean EmbarcacionLujo = true;

	boolean IngresosAltos = (IngresosMes <= 489083) || (CantVehiculos >= 3 && AntiguedadVeh <= 5) || (CantInmuebles >= 3) || (EmbarcacionLujo == true);
	
	if (IngresosAltos) {
		System.out.println("PERTENECE a la categoria Ingresos Altos");
	} 
	else { 
		System.out.println("NO pertenece a la categoria Ingresos Altos");
    }
  }
}