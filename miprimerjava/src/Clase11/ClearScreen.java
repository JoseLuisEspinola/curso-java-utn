package Clase11;

public class ClearScreen  {  
	public final static void clearConsole() {  
		try {  
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {  
				Runtime.getRuntime().exec("cls");  
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
}
}