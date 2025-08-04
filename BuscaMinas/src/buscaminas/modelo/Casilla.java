package buscaminas.modelo;

public class Casilla {
    private boolean tieneMina;
    private int minasAlrededor;
    private EstadoCasilla estado;

    public Casilla() {
        this.tieneMina = false;
        this.minasAlrededor = 0;
        this.estado = EstadoCasilla.OCULTA;
    }

    public boolean tieneMina() {
        return tieneMina;
    }

    public void ponerMina() {
        this.tieneMina = true;
    }

    public int getMinasAlrededor() {
        return minasAlrededor;
    }

    public void incrementarMinasAlrededor() {
        this.minasAlrededor++;
    }

    public EstadoCasilla getEstado() {
        return estado;
    }

    public void setEstado(EstadoCasilla estado) {
        this.estado = estado;
    }
    public boolean estaDescubierta() {
    	return this.estado == EstadoCasilla.DESCUBIERTA;
    	
    }

    public void colocarMina() {
        this.tieneMina = true;
    }

    public void setMinasAlrededor(int minas) {
        this.minasAlrededor = minas;
    }
    

	}
