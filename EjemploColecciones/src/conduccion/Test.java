package conduccion;

import java.util.HashMap;
import java.util.Map;

public class Test
{
    public static void main(String[] args)
    {
        Dni dni = new Dni("27383444", 'R');
        Persona persona = new Persona("Roberto", "Martin", dni);
        persona.obtenerInfo();

        Dni dni2 = new Dni("83224112",'A');
        Estudiante estudiante = new Estudiante("Maria", "Perez", dni2, "223");
        estudiante.obtenerInfo();

        Dni dni3 = new Dni("12345678",'X');
        Conductor personaConductora = new PersonaConductora("Jose", "Salgado", dni3);
        personaConductora.conducir();

        Dni dni4 = new Dni("87654321",'Y');
        Persona e = new Estudiante("Javi", "Lopez", dni4, "432");
        e.obtenerInfo();
        
        
        
        Persona persona2 = new Persona("Maria", "Perez", dni2);
        Persona persona3 = new Persona("Jose", "Salgado", dni3);
        Persona persona4 = new Persona("Javi", "Lopez", dni4);
        
        Map<Dni, Persona> mapaPersonas = new HashMap<Dni, Persona>();
        
        mapaPersonas.put(dni, persona);
        mapaPersonas.put(dni2, persona2);
        mapaPersonas.put(dni3, persona3);
        mapaPersonas.put(dni4, persona4);
        
        System.out.println(mapaPersonas.get(dni));
        System.out.println(mapaPersonas.get(dni2));
        System.out.println(mapaPersonas.get(dni3));
        System.out.println(mapaPersonas.get(dni4));
        
        
    }
}