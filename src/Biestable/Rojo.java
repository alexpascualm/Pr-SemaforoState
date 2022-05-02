package Biestable;

public class Rojo implements Estado {
	public Rojo() {	
	}
	@Override
	public void abrir() {
		Biestable.setEst(new Verde());
		
	}

	@Override
	public void cerrar() {	
	}

	@Override
	public String estado() {
		
		return "Cerrado";
		
	}


}
