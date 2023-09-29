package logicaChess;

public abstract class Ficha {

	protected String nombre;

	public Ficha(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public abstract String getPosiblesMovimientos(int columna, int fila);

}
