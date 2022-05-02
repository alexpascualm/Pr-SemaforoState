package Alternador;


public class Alternador {
	private static Estado est;

	public Alternador(Estado e) {
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
		Alternador.est = est;
	}
	public void cambio() {
		est.cambio();
	}
	
}
