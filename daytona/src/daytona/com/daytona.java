package daytona.com;

public class daytona {
	
	public static String veredicto (String valor1,String valor2) {
	
		if (valor1.contentEquals(valor2)) {
			return "Perfecto. Has tenido buen criterio.";
		}
		if (Integer.valueOf(valor1)< Integer.valueOf(valor2)) {
			return "Has mejorado, o te ha llegado el exito inesperado.";
		}
		return "Te has confiado. Falta realismo.";
	}
	
	
		public static void main (String args[]) {
			System.out.println("La clasificacion de "+args[0]+" : ");
			System.out.println(veredicto(args[1],args[2]));
		}
}
