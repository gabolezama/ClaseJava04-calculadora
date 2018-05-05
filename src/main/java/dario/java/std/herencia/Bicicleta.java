package dario.java.std.herencia;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Pedaleando ...");
    }

    @Override
    public void frenar() {
        System.out.println("Apretando el freno ...");
    }
    
    
}
