package colecciones;

import java.util.ArrayList;
import java.util.List;
import conduccion.Dni;
import conduccion.Persona;

public class EjecutarListaPersonas {

	public static void main(String[] args) {

		List<Persona> listaPersonas = cargarListaPersonas();
		recorrerListaPersonas(listaPersonas);
	}

	// Cargar un ArrayList con 4 personas y lo devuelve
	public static List<Persona> cargarListaPersonas() {
		Dni dni1 = new Dni("111111111", 'A');
		Dni dni2 = new Dni("222222222", 'B');
		Dni dni3 = new Dni("333333333", 'C');
		Dni dni4 = new Dni("444444444", 'D');
		
		Persona persona1 = new Persona(1, "Persona1", "Apellido1", dni1);
		Persona persona2 = new Persona(2, "Persona2", "Apellido2", dni2);	
		Persona persona3 = new Persona(3, "Persona3", "Apellido3", dni3);
		Persona persona4 = new Persona(4, "Persona4", "Apellido4", dni4);

		List<Persona> arrayLista = new ArrayList<Persona>();

		arrayLista.add(persona1);
		arrayLista.add(persona2);
		arrayLista.add(persona3);
		arrayLista.add(persona4);

		return arrayLista;
	}

	// Recorre un List con personas
	public static void recorrerListaPersonas(List<Persona> listaPersonas) {

		for (int i = 0; i < listaPersonas.size(); i++) {
			System.out.println(listaPersonas.get(i));
		}
	}
}
