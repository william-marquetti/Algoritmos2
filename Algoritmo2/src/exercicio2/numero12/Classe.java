/*
 * Imprima somente n�meros m�ltiplos de 15 que s�o pares, de 0 � 1000;
 */
package exercicio2.numero12;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = 0;
		int numeroFinal = 1000;
		int divisor = 15;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++ ){
			
			// checa se � divis�vel por pelo divisor e se � par
			if ( ( aux % divisor == 0 ) && ( aux % 2 == 0 ) ){
				System.out.println(aux);
			}
		}

	}

}
