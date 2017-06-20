package colecciones;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSetPersonas {

	public static void main(String[] args) {

		SortedSet<Persona> listaPersonas = new TreeSet<Persona>();

		Persona persona1 = new Persona(1, "Jose", "Martinez", new Dni("2233445566", 'A'));
		listaPersonas.add(persona1);
		Persona persona2 = new Persona(2, "Marta", "Bilbao", new Dni("2233445577", 'B'));
		listaPersonas.add(persona2);
		Persona persona3 = new Persona(3, "Oscar", "Igartua", new Dni("2233445588", 'C'));
		listaPersonas.add(persona3);
		
		//REVISAR
		
		System.out.println(" Lista con " + listaPersonas.size() + 
				" elementos"); 
				for( Iterator it = listaPersonas.iterator(); it.hasNext();) {
				Persona elemento = (Persona)it.next(); 
				System.out.println(elemento);
		
		/*Persona clave=null;
		Iterator<Persona> elementos=listaPersonas.iterator();
		System.out.println("Existen los siguientes elementos: ");
		while(elementos.hasNext()){
			clave= elementos.next();
			System.out.println(clave+"-->"+listaPersonas);
			
		}*/

	}

}}
