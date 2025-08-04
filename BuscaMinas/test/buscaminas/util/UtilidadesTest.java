package buscaminas.util;

import buscaminas.excepciones.CoordenadaFueraDeRangoException;
import buscaminas.excepciones.EntradaInvalidaException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilidadesTest {

    @Test
    public void testConvertirCoordenadaValida() throws EntradaInvalidaException, CoordenadaFueraDeRangoException {
        int[] resultado = Utilidades.convertirCoordenada("A1");
        assertArrayEquals(new int[]{0, 0}, resultado);

        resultado = Utilidades.convertirCoordenada("J10");
        assertArrayEquals(new int[]{9, 9}, resultado);

        resultado = Utilidades.convertirCoordenada("c5");
        assertArrayEquals(new int[]{2, 4}, resultado);
    }

    @Test
    public void testConvertirCoordenadaFormatoInvalido() {
        assertThrows(EntradaInvalidaException.class, () -> {
            Utilidades.convertirCoordenada("1A");
        });

        assertThrows(EntradaInvalidaException.class, () -> {
            Utilidades.convertirCoordenada("A");
        });
    }

    @Test
    public void testConvertirCoordenadaLetraFueraDeRango() {
        assertThrows(CoordenadaFueraDeRangoException.class, () -> {
            Utilidades.convertirCoordenada("Z5");
        });
    }

    @Test
    public void testConvertirCoordenadaNumeroFueraDeRango() {
        assertThrows(CoordenadaFueraDeRangoException.class, () -> {
            Utilidades.convertirCoordenada("A11");
        });

        assertThrows(CoordenadaFueraDeRangoException.class, () -> {
            Utilidades.convertirCoordenada("B0");
        });
    }

    @Test
    public void testConvertirCoordenadaNumeroNoValido() {
        assertThrows(EntradaInvalidaException.class, () -> {
            Utilidades.convertirCoordenada("Axx");
        });
    }
}
