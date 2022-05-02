package Alternador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlternadorTest {

	@Test
	void testAlternador() {
		assertEquals(new Alternador(new VerdeBi()).estado(), "abierto");
		assertEquals(new Alternador(new RojoBi()).estado(), "cerrado");
		assertEquals(new Alternador(new VerdeTri()).estado(), "abierto");
		assertEquals(new Alternador(new RojoTri()).estado(), "cerrado");
		assertEquals(new Alternador(new Amarillo()).estado(), "precauci�n");
		assertEquals(new Alternador(new CambioBi()).estado(), "precauci�n");
	}

	@Test
	void testAbrir() {
		Alternador RojoBi = new Alternador(new RojoBi());
		RojoBi.Abrir();
		assertEquals(RojoBi.estado(), "abierto");
		Alternador RojoTri = new Alternador(new RojoTri());
		RojoTri.Abrir();
		assertEquals(RojoTri.estado(), "precauci�n");
		Alternador Amarillo = new Alternador(new Amarillo());
		Amarillo.Abrir();
		assertEquals(Amarillo.estado(), "abierto");

	}

	@Test
	void testCerrar() {
		Alternador VerdeBi = new Alternador(new VerdeBi());
		VerdeBi.Cerrar();
		assertEquals(VerdeBi.estado(), "cerrado");
		Alternador VerdeTri = new Alternador(new VerdeTri());
		VerdeTri.Cerrar();
		assertEquals(VerdeTri.estado(), "precauci�n");
		Alternador Amarillo = new Alternador(new Amarillo());
		Amarillo.Cerrar();
		assertEquals(Amarillo.estado(), "cerrado");

	}

	@Test
	void testCambio() {
		Alternador Semaforo = new Alternador(new VerdeBi());
		Semaforo.cambio();
		Semaforo.Cerrar();
		assertEquals(Semaforo.estado(), "precauci�n");
		Semaforo.cambio();
		assertEquals(Semaforo.estado(), "precauci�n");
		Semaforo.Cerrar();
		assertEquals(Semaforo.estado(), "cerrado");
		Semaforo.cambio();
		assertEquals(Semaforo.estado(), "cerrado");
		Semaforo.Abrir();
		assertEquals(Semaforo.estado(), "precauci�n");

	}

}
