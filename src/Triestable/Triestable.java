package Triestable;

public class Triestable {
	private static Estado est;
	
	public Triestable(Estado e) {
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
		Triestable.est = est;
	}
}
