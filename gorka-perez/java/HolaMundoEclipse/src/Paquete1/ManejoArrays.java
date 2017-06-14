package Paquete1;

public class ManejoArrays
{

	public static void main(String[] args) {
		int numElementos = 20;
		int[] arrayNumeros = crearArray(numElementos);
		int elementoBuscar = 12;
		boolean encontrado = estaEnArray(arrayNumeros, elementoBuscar);
		System.out.println("Est� en array? " + encontrado);
	}
	public static int[] crearArray(int numElementos)
	{
	int[] arrayNumeros = new int [numElementos];
	
	return arrayNumeros;
	}
	public static boolean estaEnArray(int[] arrayNumeros, int elementoBuscar)
	 {
	boolean encontrado = false;
	for (int i = 0; i < arrayNumeros.length && (!encontrado); i++)
	{
		if (elementoBuscar == arrayNumeros[i])
		{
			encontrado = true;
		}	
	}
	return encontrado;
	}
}
