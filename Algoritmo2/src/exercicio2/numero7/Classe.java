/*
 * Imprima apenas n�meros pares de 0 � 100;
 */

package exercicio2.numero7;

public class Classe {
	public static void main(String[] args) {
		int quantidade = 100;
		
		for ( int aux = 0; aux <= quantidade; aux++ ){
			
			if ( aux % 2 == 0 ){
				System.out.println(aux);
			}
		}

	}

}
