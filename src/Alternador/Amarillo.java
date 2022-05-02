package Alternador;



public class Amarillo implements Estado {
	public Amarillo() {

	}

	@Override
	public void abrir() {

		Alternador.setEst(new VerdeTri());
	}

	@Override
	public void cerrar() {
		Alternador.setEst(new RojoTri());

	}

	@Override
	public String estado() {

		return "precaución";
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Alternador.setEst(new CambioBi());
	}

}
