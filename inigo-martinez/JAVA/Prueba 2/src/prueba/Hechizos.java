package prueba;

import java.util.List;
import java.util.Scanner;

public class Hechizos extends Thread {

	private int impacto = 0;
	private List<Unidad> ejercPropio;
	private List<Unidad> ejercEnemigo;

	public Hechizos(List<Unidad> ejercPro, List<Unidad> ejercEnem) {
		super();
		this.ejercPropio = ejercPro;
		this.ejercEnemigo = ejercEnem;
	}

	public int bolaDeFuego() {
		impacto = 6 * (int) (Math.random() * 9);
		return impacto;
	}

	public int curar() {
		impacto = 4 * (int) (Math.random() * 7);
		return impacto;
	}

	public void run() {
		// COMENTAR CON JON ANDER
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("�Qu� hechizo quieres utilizar?\n1-Bola de Fuego\n2-Curar");
			int opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Lanzando una peligrosamente imprecisa bola de fuego");
				bolaDeFuego();
				break;

			case 2:
				System.out.println("Tengo el d�a simpatico asi que os lanzo curaci�n");
				curar();
				break;
			}
		} while (!ejercPropio.isEmpty() && !ejercEnemigo.isEmpty());
	}

}
