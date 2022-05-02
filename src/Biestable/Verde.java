package Biestable;

public class Verde implements Estado {

	@Override
	public void abrir() {	
	}

	@Override
	public void cerrar() {
		Biestable.setEst(new Rojo());
		
	}

	@Override
	public String estado() {
		return "Abierto";
		
	}

}
