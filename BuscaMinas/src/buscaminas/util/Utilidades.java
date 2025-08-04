package buscaminas.util;

import buscaminas.excepciones.CoordenadaFueraDeRangoException;
import buscaminas.excepciones.EntradaInvalidaException;

public class Utilidades {

	    public static int[] convertirCoordenada(String entrada) throws EntradaInvalidaException, CoordenadaFueraDeRangoException {
	        if (entrada.length() < 2) {
	            throw new EntradaInvalidaException("Formato inválido. Usa algo como 'a8'.");
	        }

	        char letra = Character.toUpperCase(entrada.charAt(0));
	        if (letra < 'A' || letra > 'J') {
	            throw new CoordenadaFueraDeRangoException("Letra fuera del rango A-J.");
	        }

	        int fila = letra - 'A';

	        String numStr = entrada.substring(1);
	        int columna;

	        try {
	            columna = Integer.parseInt(numStr) - 1; // del 1 al 10 → 0 al 9
	        } catch (NumberFormatException e) {
	            throw new EntradaInvalidaException("Número inválido en la coordenada.");
	        }

	        if (columna < 0 || columna >= 10) {
	            throw new CoordenadaFueraDeRangoException("Columna fuera del rango 1-10.");
	        }

	        return new int[] { fila, columna };
	    }
	}


