package Triestable;

public class Rojo implements Estado {
	public Rojo() {	
	}
	@Override
	public void abrir() {
		Triestable.setEst(new Amarillo());
		
	}

	@Override
	public void cerrar() {	
	}

	@Override
	public String estado() {
		
		return "Cerrado";
		
	}
}
