package dario.java.std;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
	public static void main(String[] args) {
		
		// keys are Strings
		// objects are also Strings
		Map<String, String> map = new HashMap<>();
		fillData(map);

		// write to command line
		map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

		// add and remove from the map
		map.put("iPhone", "Created by Apple");
		map.remove("Android");

		// write again to command line
		map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));
                
                
                Map<String, Persona> personas = new HashMap<>();
                personas.put("1111111",  new Persona("Juan", "Pérez", "1111111"));
                personas.put("2222222", new Persona("Juan", "Gómez", "2222222"));
                personas.put("1111111", new Persona("Juan", "Gómez", "1111111"));
                personas.put("2222222", new Persona("Hector", "Peralta", "2222222"));
                personas.put("33333333", new Persona("Darío", "Hruszecki", "33333333"));
                personas.put("33333334", new Persona("Nicolás", "Hruszecki", "33333334"));
                personas.put("33333335", new Persona("Norberto", "Hruszecki", "33333335"));
                
                personas.putIfAbsent("33333335", new Persona("Norberto", "Hruszecki", "33333335"));
                
                personas.replace("k", new Persona("Norberto", "Hruszecki", "33333335"));
                
                Persona p = personas.get("444");
                
                personas.getOrDefault("44444", new Persona("Norberto", "Hruszecki", "33333335"));
                
	
	}

	private static void fillData(Map<String, String> map) {
		map.put("Android", "Mobile");
		map.put("Eclipse IDE", "Java");
		map.put("Eclipse RCP", "Java");
		map.put("Git", "Version control system");
		
	}

}
