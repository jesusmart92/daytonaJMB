package daytona.com;

public class daytona {
	
	private static String veredicto (String valor1,String valor2) { //Se le pasan 2 parametros al llamar al metodo veredicto
	
		if (valor1.contentEquals(valor2)) { //Se compara el primer parametro con el segundo, Si el primero es igual al 2
			return "Perfecto. Has tenido buen criterio.";
		}//
		if (Integer.valueOf(valor1)< Integer.valueOf(valor2)) { // Compara si el primer argumento es menor que el segundo
			return "Has mejorado, o te ha llegado el exito inesperado.";
		}
		return "Te has confiado. Falta realismo."; // Si no es ninguna de las de antes devuelve esto.
	}
	
	
		public static void main (String args[]) {
			System.out.println("La clasificacion de "+args[0]+" : ");
			System.out.println(veredicto(args[1],args[2]));
		}
}
