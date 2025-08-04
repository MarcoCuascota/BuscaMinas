package buscaminas.modelo;


public class CasillaConMina extends ElementoTablero {

    @Override
    public boolean tieneMina() {
        return true;
    }

    @Override
    public int getNumeroMinasAlrededor() {
        return -1; // No aplica
    }

    @Override
    public void incrementarNumeroMinas() {
        // No hace nada, es una mina
    }

    @Override
    public char mostrar() {
        return descubierta ? '✹' : '■';
    }
}