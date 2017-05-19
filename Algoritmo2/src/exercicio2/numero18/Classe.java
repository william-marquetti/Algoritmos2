/*
 * Imprimir uma lista com as 10 primeiras letras do alfabeto:
	A
	B
	C
	D
	E
	F
	G
	H
	I
	J

 */
package exercicio2.numero18;

public class Classe {
	public static void main(String[] args) {
		
		int contador = 1;
		int quantidadeLetras = 10;

		for (char letra = 'A'; letra <= 'Z'; letra++) {
			
			if (contador <= quantidadeLetras){
				System.out.println(letra);
			}
			
			contador++;

		}

	}

}
