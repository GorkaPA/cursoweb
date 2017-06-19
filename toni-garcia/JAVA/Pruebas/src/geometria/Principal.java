package geometria;

public class Principal {

	static Punto circulo, cuadrado, triangulo;

	public static void main(String[] args) {

		// INICIO 1� EJERCICIO
		cuadrado = new Punto(2, 3);
		triangulo = new Punto(7, 7);
		System.out.println(cuadrado.getX());
		System.out.println(cuadrado.getY());
		cuadrado.setX(12);
		cuadrado.setY(9);
		System.out.println(cuadrado.getX());
		System.out.println(cuadrado.getY());
		System.out.println("***************************");

		// INICIO 2� EJERCICIO
		Punto puntoClon = new Punto(triangulo);
		System.out.println(puntoClon.getX());
		System.out.println(puntoClon.getY());
		Punto.desplazarObjeto(triangulo, 3, 4);
		System.out.println(triangulo.getX());
		System.out.println(triangulo.getY());
		Punto.desplazarObjeto(triangulo, 8, 6);
		System.out.println(triangulo.getX());
		System.out.println(triangulo.getY());
		System.out.println("***************************");

		// INICIO 3� EJERCICIO
		double distancia = Punto.calcularDistancia(3, 2, 3, 2);
		System.out.println("La distancia es " + distancia);
		System.out.println("***************************");

		// INICIO 4� EJERCICIO
		System.out.println("La distancia m�s el valor de desplazamiento es");// Evaluaci�n
																				// metodo
																				// desplazar()
																				// sobrecargado
		double x = 1.2, y = 5.3;
		circulo = new Punto(x, y);
		cuadrado = new Punto(x,y);
		triangulo = new Punto (x,y);
		
	}

}
