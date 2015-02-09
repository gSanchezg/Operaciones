package org;

/**
 * Clase con operaciones básicas
 * @author German
 *
 */

public class Operaciones {

	public int sumar(int a, int b){
		return a + b;
	}
	
	public int restar(int a, int b){
		return a - b;
	}
	
	public int multiplicar(int a, int b){
		return a * b;
	}
	
	public int dividir (int a, int b) throws Exception{
		if (b==0) 
			throw new Exception("No se puede dividir entre cero");
		return a / b;
	}
	
}
