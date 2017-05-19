/*
 * Imprima duas listas, uma de 0 a 10 e outra de 10 a 0;
 */
package exercicio2.numero10;

public class Classe {
	public static void main(String[] args) {

		System.out.println("Lista de 0 a 10\r\n");
		
		for (int aux = 0; aux <= 10; aux++) {
			System.out.println(aux);
		}

		System.out.println("\r\nLista de 10 a 0\r\n");
		for (int aux = 10; aux >= 0; aux--) {
			System.out.println(aux);
		}

	}

}
