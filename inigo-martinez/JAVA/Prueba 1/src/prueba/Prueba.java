package prueba;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Prueba {

	public static void main(String args[]) {

		Humanos Humanos;
		Orcos Orcos;
		int eleccion, tamanio;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Elige uno de los bandos:");
		System.out.println("1.- Humanos");
		System.out.println("2.- Orcos");
		System.out.println("Recuerdo que las aldeas se defienden con un minimo:");
		System.out.println("Humanos ---> 20 soldados");
		System.out.println("Orcos ---> 50 soldados");

		eleccion = teclado.nextInt();

		switch (eleccion) {

		case 1:
			// Humanos
			tamanio = teclado.nextInt();
			Humanos = new Humanos(tamanio);
			// ORCOS
			Orcos = new Orcos(tamanio /**+ 50**/);

			break;

		case 2:

			tamanio = teclado.nextInt();
			// ORCOS
			Orcos = new Orcos(tamanio);
			// HUMANOS
			if (tamanio > 120) {
				Humanos = new Humanos(tamanio /**- 100**/);
			} else {
				Humanos = new Humanos(20);
			}

		}

	}

}