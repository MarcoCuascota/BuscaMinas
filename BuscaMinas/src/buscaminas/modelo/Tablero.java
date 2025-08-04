package buscaminas.modelo;

import java.util.Random;

public class Tablero {

    private int filas;
    private int columnas;
    private int minasTotales;
    private Casilla[][] casillas;

    public Tablero(int filas, int columnas, int minasTotales) {
        this.filas = filas;
        this.columnas = columnas;
        this.minasTotales = minasTotales;
        this.casillas = new Casilla[filas][columnas];
        inicializarCasillas();
        colocarMinas();
        contarMinasAlrededor();
    }

    private void inicializarCasillas() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                casillas[f][c] = new Casilla();
            }
        }
    }

    private void colocarMinas() {
        Random rand = new Random();
        int minasColocadas = 0;
        while (minasColocadas < minasTotales) {
            int f = rand.nextInt(filas);
            int c = rand.nextInt(columnas);
            if (!casillas[f][c].tieneMina()) {
                casillas[f][c].colocarMina();
                minasColocadas++;
            }
        }
    }

    private void contarMinasAlrededor() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (!casillas[f][c].tieneMina()) {
                    int minas = contarMinasVecinas(f, c);
                    casillas[f][c].setMinasAlrededor(minas);
                }
            }
        }
    }

    private int contarMinasVecinas(int fila, int col) {
        int contador = 0;
        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < filas && j >= 0 && j < columnas && !(i == fila && j == col)) {
                    if (casillas[i][j].tieneMina()) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

   

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }

    public Casilla getCasilla(int fila, int columna) {
        return casillas[fila][columna];
    }

    
    public boolean estaCompleto() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                Casilla casilla = casillas[f][c];
                if (!casilla.tieneMina() && casilla.getEstado() != EstadoCasilla.DESCUBIERTA) {
                    return false;
                }
            }
        }
        return true;
    }
    public void descubrirCasilla(int fila, int columna) {
        casillas[fila][columna].setEstado(EstadoCasilla.DESCUBIERTA);
    }

    public boolean tieneMina(int fila, int columna) {
        return casillas[fila][columna].tieneMina();
    }

    public boolean estaDescubierta(int fila, int columna) {
        return casillas[fila][columna].getEstado() == EstadoCasilla.DESCUBIERTA;
    }

}
