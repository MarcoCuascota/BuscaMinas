package buscaminas.modelo;



public abstract class ElementoTablero {
    protected boolean descubierta = false;

    public abstract boolean tieneMina();
    public abstract int getNumeroMinasAlrededor();
    public abstract void incrementarNumeroMinas();
    public abstract char mostrar();

    public void descubrir() {
        descubierta = true;
    }

    public boolean estaDescubierta() {
        return descubierta;
    }
}
