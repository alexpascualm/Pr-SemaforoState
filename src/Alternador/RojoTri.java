package Alternador;

public class RojoTri implements Estado{
	public RojoTri(){
		
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Alternador.setEst(new Amarillo());
		
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
		Alternador.setEst(new RojoBi());
		
	}

}
