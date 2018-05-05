package dario.java.std.herencia;

public abstract class VehiculoMotorizado extends Vehiculo {
    
    public VehiculoMotorizado(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void encender() {
        System.out.println("Encendiendo ...");
    }

    public void apagar() {
        System.out.println("Apagando ...");
    } 
}
