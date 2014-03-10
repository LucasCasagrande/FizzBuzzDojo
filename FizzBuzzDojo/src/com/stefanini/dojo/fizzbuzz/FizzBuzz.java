package com.stefanini.dojo.fizzbuzz;

public class FizzBuzz {

	private static final String RETORNO_FIZZ = "Fizz";

	public static String executa(int entrada) {

		String retorno = "";

		if (ehFizz(entrada)) {
			retorno = RETORNO_FIZZ;

		}
		if (entrada % 5 == 0) {
			retorno += "Buzz";

		}

		if (retorno.equals("")) {
			retorno = String.valueOf(entrada);
		}

		return retorno;
	}

	private static boolean ehFizz(int entrada) {
		return entrada % 3 == 0;
	}

}
