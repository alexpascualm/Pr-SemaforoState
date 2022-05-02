package Biestable;

public class Biestable {
	private static Estado est;

	public Biestable(Estado e) {
		est = e;
	}

	public void Abrir() {
		est.abrir();
	}

	public void Cerrar() {
		est.cerrar();
	}

	public String estado() {
		return est.estado();
	}

	public static void setEst(Estado est) {
		Biestable.est = est;
	}
	
	
}
