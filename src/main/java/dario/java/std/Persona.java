package dario.java.std;

import java.util.Objects;

class Persona implements Comparable<Persona> {
    private final String nombre;
    private final String apellido;
    private final String dni;
    private int edad;

    public Persona(String nombre, String apellido, String dni, int edad) {
        this(nombre, apellido, dni);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

    //https://www.javaworld.com/article/2072488/apache-commons-equalsbuilder-and-hashcodebuilder.html

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    




    /*
        Orden natural
    */
    @Override
    public int compareTo(Persona o) {
        return this.dni.compareTo(o.dni);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }


    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Perez","444");
        Persona p2 = new Persona("Juan", "Perez","444", 34);
        //Persona p3 = new Persona();

    }
    
    
    
}