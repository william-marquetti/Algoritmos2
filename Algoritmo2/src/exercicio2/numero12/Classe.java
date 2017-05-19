/*
 * Imprima somente números múltiplos de 15 que são pares, de 0 à 1000;
 */
package exercicio2.numero12;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = 0;
		int numeroFinal = 1000;
		int divisor = 15;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++ ){
			
			// checa se é divisível por pelo divisor e se é par
			if ( ( aux % divisor == 0 ) && ( aux % 2 == 0 ) ){
				System.out.println(aux);
			}
		}

	}

}
