package dario.java.std.herencia;


public class Auto extends VehiculoMotorizado {
    
    private Desplazable desplazable = new DesplazableAMotor();
    
    public Auto(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }
    
    public void abrirBaul() {
        System.out.println("Abriendo baúl ...");
    }

    @Override
    public void acelerar() {
        desplazable.acelerar();
    }

    @Override
    public void frenar() {
        desplazable.frenar();
    }
    
}
