package dario.java.std.calculadoraoop;


public class TipoOperacionIncorrectaException extends Exception {
    
    private String tipoOperacion;

    public TipoOperacionIncorrectaException(String tipoOperacion) {
        super("Tipo de operacion incorreta: " + tipoOperacion);
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

}
