package pe.com.arland.cliente1.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TEST CALCULADORA")
class CalculadoraTest {

	@Test
	void testSuma() {
		double esperado = 50; // 30 + 20
		double resultado = Calculadora.suma(30, 20);
		assertEquals(esperado, resultado);
	}

	@Test
	void testResta() {
		double esperado = 10; // 30 - 20
		double resultado = Calculadora.resta(30,20);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicacion() {
		double esperado = 600; // 20 * 30
		double resultado = Calculadora.multiplicacion(20, 30);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void tesDivision() {
		double esperado = 1.5; // 30 / 20
		double resultado = Calculadora.division(30, 20);
		assertEquals(esperado, resultado);
	}
}
