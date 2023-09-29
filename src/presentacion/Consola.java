package presentacion;

import logicaChess.Tablero;

public class Consola {

	Tablero tablero;

	public Consola() {
		tablero = new Tablero(null);
	}

	public static void main(String[] args) {
		Consola consola = new Consola();
		consola.iniciar();
	}

	private void iniciar() {
		System.out.println("Bienvenido al juego de ajedrez");
		System.out.println("Seleccione una opcion:");
		System.out.println("1. Visualizar tablero");
		System.out.println("2. Actualizar posicion ficha");
		System.out.println("3. Salir");
		int opcion = 0;
		do {
			opcion = leerOpcion();
			if (opcion == 1) {
				System.out.println("Tablero");
			}
			else if (opcion == 2) {

			}
			else if (opcion == 3) {

			}
			else {
				System.out.println("Opcion no valida");

			}
		} while (opcion != 3);
	}

	private int leerOpcion() {
		int opcion = 0;
		try {
			opcion = System.in.read();
		}
		catch (Exception e) {
			System.out.println("Error al leer la opcion");
		}
		return opcion;
	}
}
