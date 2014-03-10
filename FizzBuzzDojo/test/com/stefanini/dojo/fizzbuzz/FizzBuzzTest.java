package com.stefanini.dojo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testMultiploDe3() {
		
		/**
		 * DADO QUE entrada � m�ltiplo de 3
		 */
		int entrada = 9;
		
		/**
		 * QUANDO executo FizzBuzz
		 */
		String resultado = FizzBuzz.executa(entrada);
		
		/**
		 * ENT�O retorna 'Fizz'
		 */
		Assert.assertEquals("Fizz", resultado);
	}

	@Test 
	public void testMultiploDe5(){
		
		/**
		 * DADO QUE entrada � m�ltiplo de 5
		 */
		
		int entrada = 10;
		
		/**
		 * QUANDO executo FizzBuzz
		 */
		
		String resultado = FizzBuzz.executa(entrada);
		
		/**
		 * Ent�o retorna 'Buzz'
		 */
	
		Assert.assertEquals("Buzz", resultado);
		
	}
	@Test
	public void testMultiploDe3e5(){
		/**
		 * DADO QUE entrada � m�ltiplo de 3 e 5
		 */
		int entrada = 15;
		
		/**
		 * QUANDO executo FizzBuzz
		 */
		String resultado = FizzBuzz.executa(entrada);
		
		/**
		 * ENT�O retorna 'FizzBuzz'
		 */
		Assert.assertEquals("FizzBuzz", resultado);
	}
	
	@Test
	public void testNaoMultiploDe3ou5(){
		/**
		 * DADO QUE entrada n�o � m�ltiplo de 3 nem m�ltiplo de 5
		 */
		int entrada = 1;
		
		/**
		 * QUANDO executo FizzBuzz
		 */
		String resultado = FizzBuzz.executa(entrada);
		
		/**
		 * ENT�O retorna o pr�prio n�mero
		 */
		Assert.assertEquals(String.valueOf(entrada), resultado);
	}
	
	
}
