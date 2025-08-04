package buscaminas.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TableroTest {

    private Tablero tablero;

    @BeforeEach
    public void setUp() {
        tablero = new Tablero(5, 5, 3); // 5x5 con 3 minas
    }

    @Test
    public void testDimensionesTablero() {
        assertEquals(5, tablero.getFilas(), "Debe tener 5 filas");
        assertEquals(5, tablero.getColumnas(), "Debe tener 5 columnas");
    }

    @Test
    public void testCantidadMinasInicial() {
        int minas = contarMinasEnTablero();
        assertEquals(3, minas, "Debe tener 3 minas colocadas");
    }

    private int contarMinasEnTablero() {
        int contador = 0;
        for (int f = 0; f < tablero.getFilas(); f++) {
            for (int c = 0; c < tablero.getColumnas(); c++) {
                if (tablero.tieneMina(f, c)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    @Test
    public void testDescubrirCasilla() {
        tablero.descubrirCasilla(2, 2);
        assertEquals(EstadoCasilla.DESCUBIERTA, tablero.getCasilla(2, 2).getEstado(),
            "La casilla (2,2) debe estar descubierta");
    }
}
