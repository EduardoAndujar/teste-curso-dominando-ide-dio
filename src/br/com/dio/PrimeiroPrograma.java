package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato("Bento", "Caramelo claro", 3);
		Gato gato2 = new Gato("Bento", "Caramelo claro", 3);
		Gato gato3 = new Gato("Bento", "Caramelo claro", 1);
		Gato gato4 = gato;
		Gato gato5 = gato2;

		System.out.println(gato.equals(gato2));
		System.out.println(gato.equals(gato5));
		System.out.println(gato.equals(gato4));

		System.out.println(gato4);
		System.out.println(gato5);
		System.out.println(gato3);


	}

}
