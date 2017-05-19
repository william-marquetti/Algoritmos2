/*
 * Imprima somente números que são múltiplos de 100, de -100 à 100;
 */
package exercicio2.numero14;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = -100;
		int numeroFinal = 100;
		int divisor = 100;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++){
			if ( aux % divisor == 0){
				System.out.println(aux);
			}
			
		}
	}
}
