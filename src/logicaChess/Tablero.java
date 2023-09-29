package logicaChess;

public class Tablero {

	Ficha tablero[][] = new Ficha[8][8];

	public Tablero(Ficha[][] tablero) {
		this.tablero = tablero;
	}

	public Ficha getFicha(int columna, int fila) {
		return tablero[columna][fila];
	}

	public void setFicha(int columna, int fila, Ficha ficha) {
		tablero[columna][fila] = ficha;
	}

	public void actualizarPosicionFicha(int columna, int fila, int nuevaColumna, int nuevaFila) {
		Ficha ficha = tablero[columna][fila];
		tablero[columna][fila] = null;
		tablero[nuevaColumna][nuevaFila] = ficha;
	}
}




















