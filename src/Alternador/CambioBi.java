package Alternador;

public class CambioBi implements Estado {

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		Alternador.setEst(new VerdeBi());
		
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		Alternador.setEst(new RojoBi());
		
	}

	@Override
	public String estado() {
		// TODO Auto-generated method stub
		return "precaución";
	}

	@Override
	public void cambio() {
		// TODO Auto-generated method stub
		Alternador.setEst(new Amarillo());
		
	}

}
