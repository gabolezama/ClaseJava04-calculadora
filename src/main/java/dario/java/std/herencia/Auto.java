package dario.java.std.herencia;


public class Auto extends VehiculoMotorizado {
    
    public Auto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void abrirBaul() {
        System.out.println("Abriendo baúl ...");
    }
    
}
