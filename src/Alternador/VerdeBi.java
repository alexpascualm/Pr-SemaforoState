package Alternador;



public class VerdeBi implements Estado {
		public VerdeBi(){
			
		}
		@Override
		public void abrir() {
			// TODO Auto-generated method stub
			
			
		}

		@Override
		public void cerrar() {
			// TODO Auto-generated method stub
			Alternador.setEst(new RojoBi());
		}

		@Override
		public String estado() {
			// TODO Auto-generated method stub
			return "abierto";

		}
		@Override
		public void cambio() {
			// TODO Auto-generated method stub
			Alternador.setEst(new VerdeTri());
		}

	}



