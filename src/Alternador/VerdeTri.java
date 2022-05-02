package Alternador;

public class VerdeTri implements Estado {
	public VerdeTri() {

	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		Alternador.setEst(new Amarillo());
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "abierto";
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Alternador.setEst(new VerdeBi());
	}
}
