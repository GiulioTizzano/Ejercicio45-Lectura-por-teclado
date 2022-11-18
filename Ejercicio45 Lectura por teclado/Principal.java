import java.util.Scanner; // Importando la clase Scanner

public  class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Creando el objeto Scanner
		System.out.print("Introduzca un valor entero: ");

		int a = scanner.nextInt(); // Leyendo el input del usuario
		
		Scanner scanner2 = new Scanner(System.in); // Creando el segundo objeto Scanner
		System.out.print("Introduzca el segundo valor entero: ");

		int b = scanner2.nextInt();
		System.out.println("La suma de los enteros a y b es: " + (a + b));
	
	
	}


}
