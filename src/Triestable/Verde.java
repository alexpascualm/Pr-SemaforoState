package Triestable;



public class Verde implements Estado {
	public Verde() {	
	}
	@Override
	public void abrir() {
		
		
	}

	@Override
	public void cerrar() {	
		Triestable.setEst(new Amarillo());
	}

	@Override
	public String estado() {
		return "Abierto";
		
	}
}
