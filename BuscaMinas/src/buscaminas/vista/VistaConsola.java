package buscaminas.vista;

import buscaminas.modelo.Casilla;
import buscaminas.modelo.EstadoCasilla;
import buscaminas.modelo.Tablero;

public class VistaConsola {

    public void mostrarBienvenida() {
        System.out.println(">>Bienvenido al Buscaminas<<");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Método compatible con JuegoBuscaminas
    public void mostrarTablero(Tablero tablero) {
    	Casilla[][] casillas = tablero.getCasillas();
        System.out.print("   ");
        for (int col = 0; col < casillas[0].length; col++) {
            System.out.print((col + 1) + " ");
        }
        System.out.println();

        for (int fila = 0; fila < casillas.length; fila++) {
            char letraFila = (char) ('A' + fila);
            System.out.print(letraFila + "  ");
            for (int col = 0; col < casillas[fila].length; col++) {
                Casilla casilla = casillas[fila][col];
                if (casilla.getEstado() == EstadoCasilla.DESCUBIERTA) {
                    if (casilla.tieneMina()) {
                        System.out.print("X ");
                    } else {
                        System.out.print(casilla.getMinasAlrededor() + " ");
                    }
                } else if (casilla.getEstado() == EstadoCasilla.MARCADA) {
                    System.out.print("⚑ ");
                } else {
                    System.out.print("⬜ ");
                }
            }
            System.out.println();
        }
    }


    public void mostrarTableroFinal(Tablero tablero) {
    	Casilla[][] casillas = tablero.getCasillas(); 
        System.out.print("   ");
        for (int col = 0; col < casillas[0].length; col++) {
            System.out.print((col + 1) + " ");
        }
        System.out.println();

        for (int fila = 0; fila < casillas.length; fila++) {
            char letraFila = (char) ('A' + fila);
            System.out.print(letraFila + "  ");
            for (int col = 0; col < casillas[fila].length; col++) {
                Casilla casilla = casillas[fila][col];
                if (casilla.tieneMina()) {
                    System.out.print("X ");
                } else {
                    System.out.print(casilla.getMinasAlrededor() + " ");
                }
            }
            System.out.println();
        }
    }
}
