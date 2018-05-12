package dario.java.std.herencia;

public class Avion extends VehiculoMotorizado implements Volable {
    
    public Avion(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("Moviendo palanca para acelerar ...");
    }

    @Override
    public void frenar() {
        System.out.println("Moviendo palanca para frenar ...");
    }

    @Override
    public void despegar() {
        System.out.println("Moviendo palanca para despegar ...");
    }

    @Override
    public void volar() {
        System.out.println("Moviendo palanca para volar ...");
    }

    @Override
    public void aterrizar() {
        System.out.println("Moviendo palanca para aterrizar ...");
    }
    
    
    
}
