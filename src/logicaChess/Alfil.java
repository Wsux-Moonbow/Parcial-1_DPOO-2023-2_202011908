package logicaChess;

public class Alfil extends Ficha{

	public Alfil(String nombre) {
		super(nombre);

	}

	@Override
	public String getPosiblesMovimientos(int columna, int fila) {
		String posiblesMovimientosString = "";
		for (int i = 0; i < 8; i++) {
			if (i != columna) {
				posiblesMovimientosString += i + "" + fila + " ";
			}
		}
		return posiblesMovimientosString;
	}

}
