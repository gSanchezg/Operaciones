package test;

import static org.junit.Assert.*;

import org.Operaciones;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionesTest {

	private Operaciones tester;
	
	@Before
	public void iniciarTest() {
		tester = new Operaciones();
	}
	
	@BeforeClass
	public static void iniciar() {
		System.out.println("Iniciamos las pruebas");
	}
	
	@AfterClass
	public static void finalizar() {
		System.out.println("Pruebas finalizadas");
	}
	
	@Test
	public void testSumar() {
		assertEquals("10+2 debe ser 12", 12, tester.sumar(10, 2));
	}
	
	@Test
	public void testRestar() {
		assertEquals("10-2 debe ser 8", 8, tester.restar(10, 2));
	}
	
	@Test
	public void testMultiplicar() {
		assertEquals("10*2 debe ser 20", 20, tester.multiplicar(10, 2));
		assertTrue("10*0 debe ser 0", tester.multiplicar(10, 0)==0);
	}
	
	@Test
	public void testDividir() throws Exception {
		assertEquals("10/2 debe ser 5", 5, tester.dividir(10, 2));
	}
	
	@Test(expected=Exception.class)
	public void testDividirEntreCero() throws Exception {
		tester.dividir(10, 0);
	}

}
