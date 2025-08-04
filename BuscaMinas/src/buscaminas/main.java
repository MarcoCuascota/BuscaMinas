package buscaminas;

import buscaminas.controlador.JuegoBuscaminas;

public class main {

	public static void main (String[] args) {
	
        JuegoBuscaminas juego = new JuegoBuscaminas(10, 10, 10);
        juego.iniciar();
    }
}
