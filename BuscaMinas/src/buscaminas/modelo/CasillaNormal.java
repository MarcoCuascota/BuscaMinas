package buscaminas.modelo;


public class CasillaNormal extends ElementoTablero {
    private int numeroMinasAlrededor = 0;

    @Override
    public boolean tieneMina() {
        return false;
    }

    @Override
    public int getNumeroMinasAlrededor() {
        return numeroMinasAlrededor;
    }

    @Override
    public void incrementarNumeroMinas() {
        numeroMinasAlrededor++;
    }

    @Override
    public char mostrar() {
        if (!descubierta) return '■';
        return (numeroMinasAlrededor == 0) ? ' ' : Character.forDigit(numeroMinasAlrededor, 10);
    }
}