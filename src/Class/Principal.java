package Class;

import java.util.Scanner;
public class Principal {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		/*Escribe un programa en Java que me diga si un número es divisible por 2, 3, 5 o 7
(debe decir por todos los que es divisible).*/

		System.out.println("Introduce cualquier numero: ");
		double numero = scanner.nextDouble();
		if (numero % 2 == 0) {
			System.out.println("Es divisible por dos ");
		}else {
			System.out.println("No es divisible por dos ");
		}if (numero % 3 == 0) {
			System.out.println("Es divisible por tres ");
		}else {
			System.out.println("No es divisible por tres ");
		}if (numero % 5 == 0 ){
			System.out.println("Es divisible por cinco ");
		} else if (numero % 7 == 0) {
			System.out.println("Es divisible por siete ");
		}else if (numero % 10 == 0) {
			System.out.println("Es divisible por 10 ");
		}else {
			System.out.println("No es divisible ni por siete ni por cinco ");
		}
		System.out.println("Gracias por usar el programa");
	}	
}