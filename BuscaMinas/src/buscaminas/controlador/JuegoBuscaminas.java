package buscaminas.controlador;

import buscaminas.modelo.Tablero;
import buscaminas.vista.VistaConsola;
import buscaminas.util.Utilidades;
import buscaminas.excepciones.*;

import java.util.Scanner;

public class JuegoBuscaminas {
    private final Tablero tablero;
    private final VistaConsola vista;
    private final Scanner scanner;

    public JuegoBuscaminas(int filas, int columnas, int minas) {
        this.tablero = new Tablero(filas, columnas, minas);
        this.vista = new VistaConsola();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean juegoTerminado = false;

        vista.mostrarBienvenida();

        while (!juegoTerminado) {
            vista.mostrarTablero(tablero);
            System.out.print("Ingrese una coordenada (ej. A5): ");
            String entrada = scanner.next().toUpperCase();

            try {
                int[] coordenadas = Utilidades.convertirCoordenada(entrada);
                int fila = coordenadas[0];
                int columna = coordenadas[1];

                if (tablero.estaDescubierta(fila, columna)) {
                    throw new CasillaYaDescubiertaException();
                }

                tablero.descubrirCasilla(fila, columna);

                if (tablero.tieneMina(fila, columna)) {
                    vista.mostrarTableroFinal(tablero);
                    System.out.println("💥 ¡BOOM! Has perdido.");
                    juegoTerminado = true;
                } else if (tablero.estaCompleto()) {
                    vista.mostrarTableroFinal(tablero);
                    System.out.println(" ¡Felicidades! Has ganado.");
                    juegoTerminado = true;
                }

            } catch (EntradaInvalidaException | CoordenadaFueraDeRangoException | CasillaYaDescubiertaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
