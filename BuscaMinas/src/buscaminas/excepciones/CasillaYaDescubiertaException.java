package buscaminas.excepciones;

public class CasillaYaDescubiertaException extends Exception {
    public CasillaYaDescubiertaException() {
        super("Casilla ya descubierta");
    }
}

