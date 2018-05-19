package dario.java.std;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetsExample {

    
    public static void main(String[] args) {
        
        Set<String> s1 = new HashSet<>();
        s1.add("Hola");
        s1.add("Hola45");
        s1.add("Hola2");      
        s1.add("Chau");
        s1.add("Cómo estás?");
        s1.add("Cómo estás vos?");
        
        // old java
//        System.out.println("old java");
//        Iterator<String> it1 = s1.iterator();
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
        
//        // pido otro iterador porque no se pueden reutilizar
//        System.out.println("old java - segundo iterador");
//        Iterator<String> it2 = s1.iterator();
//
//        while (it2.hasNext()){
//            System.out.println(it2.next());
//        }
//
//        // for each (1.5+)
//        System.out.println("for each");
//        for (String s : s1) {
//            System.out.println(s);
//        }
//        
//        // functional (8+)
//        System.out.println("functional");
//        s1.forEach(s -> System.out.println(s));
        
        // functional member reference
//        System.out.println("functional");
//        s1.forEach(System.out::println);

       
//        Set<String> ordenado = new TreeSet<>();
//        ordenado.add("Hola");
//        ordenado.add("Hola");
//        ordenado.add("Hola");      
//        ordenado.add("Chau");
//        ordenado.add("Cómo estás?");
//        ordenado.add("Cómo estás vos?");        
//                
//        // functional member reference
//        System.out.println("sorted set");
//        ordenado.forEach(System.out::println);
//        
//        
        // equals / hashcode en Sets
        
        
        /*
           Este treeSet ordena los elementos por su orden natural
        */
//        Set<Persona> personas = new TreeSet<>();
//        Persona p1 = new Persona("Juan", "Gómez", "22222221");
//        Persona p2 = new Persona("Juan", "Gómez", "22222221");
//        
//        System.out.println(p1.equals(p2));
//        
//        personas.add(new Persona("Juan", "Pérez", "1111111"));
//        personas.add(p1);
//        personas.add(new Persona("Juan", "Gómez", "1111111"));
//        personas.add(p2);
//        personas.add(new Persona("Darío", "Hruszecki", "33333333"));
//        personas.add(new Persona("Nicolás", "Hruszecki", "33333334"));
//        personas.add(new Persona("Norberto", "Hruszecki", "33333335"));
//        personas.forEach(System.out::println);
       
        
        /* 
            Si le pasamos un comparator parámetros no utiliza el orden 
            natural
        */
//        Set<Persona> personasAN = new TreeSet<>(new PersonasPorApellidoYNombre());
//        personasAN.add(new Persona("Juan", "Pérez", "1111111"));
//        personasAN.add(new Persona("Juan", "Gómez", "2222222"));
//        personasAN.add(new Persona("Juan", "Gómez", "1111111"));
//        personasAN.add(new Persona("Hector", "Peralta", "2222222"));
//        personasAN.add(new Persona("Darío", "Hruszecki", "33333333"));
//        personasAN.add(new Persona("Nicolás", "Hruszecki", "33333334"));
//        personasAN.add(new Persona("Norberto", "Hruszecki", "33333335"));
//
//        personasAN.forEach(System.out::println);
        
        Set<Persona> personasPorAND = new TreeSet<>(new PersonasPorApellidoYNombreYDni());
        personasPorAND.add(new Persona("Juan", "Pérez", "1111111"));
        personasPorAND.add(new Persona("Juan", "Gómez", "2222222"));
        personasPorAND.add(new Persona("Juan", "Gómez", "1111111"));
        personasPorAND.add(new Persona("Hector", "Peralta", "2222222"));
        personasPorAND.add(new Persona("Darío", "Hruszecki", "33333333"));
        personasPorAND.add(new Persona("Nicolás", "Hruszecki", "33333334"));
        personasPorAND.add(new Persona("Norberto", "Hruszecki", "33333335"));

        personasPorAND.forEach(System.out::println);

    }
    
}

class PersonasPorApellidoYNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int ret = o1.getApellido().compareTo(o2.getApellido());
        
        if (ret == 0)
            ret = o1.getNombre().compareTo(o2.getNombre());
        
        return ret;
    }
    
}


class PersonasPorApellidoYNombreYDni implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        int ret = o1.getApellido().compareTo(o2.getApellido());
        
        if (ret == 0)
            ret = o1.getNombre().compareTo(o2.getNombre());
        
        if (ret == 0)
            ret = o1.getDni().compareTo(o2.getDni());
        
        return ret;
    }
    
}