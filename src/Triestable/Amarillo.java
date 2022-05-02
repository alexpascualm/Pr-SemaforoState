package Triestable;

public class Amarillo implements Estado {
	public Amarillo() {

	}

	@Override
	public void abrir() {

		Triestable.setEst(new Verde());
	}

	@Override
	public void cerrar() {
		Triestable.setEst(new Rojo());

	}

	@Override
	public String estado() {

		return "Precaución";
	}

}
