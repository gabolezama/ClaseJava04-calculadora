package dario.java.std.herencia;

public class Vehiculo {
 
    protected String color;
    protected String marca;
    protected String modelo;

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar() {
        System.out.println("Acelerando ...");
    }
    
    public void frenar() {
        System.out.println("Frenando ...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
