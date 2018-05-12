package dario.java.std.herencia;

public class Moto extends VehiculoMotorizado {

    private Desplazable desplazable = new DesplazableAMotor();

    public Moto(String color, String marca, String modelo) {
        super(color, marca, modelo);
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
