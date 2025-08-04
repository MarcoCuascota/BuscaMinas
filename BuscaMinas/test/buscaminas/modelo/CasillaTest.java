package buscaminas.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CasillaTest {

    private Casilla casilla;

    @BeforeEach
    public void setUp() {
        casilla = new Casilla();
    }

    @Test
    public void testNuevaCasillaNoTieneMina() {
        assertFalse(casilla.tieneMina());
    }

    @Test
    public void testPonerMina() {
        casilla.ponerMina();
        assertTrue(casilla.tieneMina());
    }

    @Test
    public void testMinasAlrededor() {
        casilla.setMinasAlrededor(3);
        assertEquals(3, casilla.getMinasAlrededor());
    }

    @Test
    public void testIncrementarMinasAlrededor() {
        casilla.incrementarMinasAlrededor();
        casilla.incrementarMinasAlrededor();
        assertEquals(2, casilla.getMinasAlrededor());
    }

    @Test
    public void testEstadoInicial() {
        assertEquals(EstadoCasilla.OCULTA, casilla.getEstado());
    }

    @Test
    public void testCambiarEstado() {
        casilla.setEstado(EstadoCasilla.MARCADA);
        assertEquals(EstadoCasilla.MARCADA, casilla.getEstado());
    }

    @Test
    public void testEstaDescubierta() {
        casilla.setEstado(EstadoCasilla.DESCUBIERTA);
        assertTrue(casilla.estaDescubierta());
    }
}
