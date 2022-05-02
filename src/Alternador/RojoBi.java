package Alternador;

public class RojoBi implements Estado{
	public RojoBi() {
		
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Alternador.setEst(new VerdeBi());
		
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "cerrado";
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Alternador.setEst(new RojoTri());
		
	}

}
