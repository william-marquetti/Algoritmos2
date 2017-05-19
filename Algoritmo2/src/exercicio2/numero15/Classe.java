/*
 * Imprima apenas números do qual a divisão por 3, retorne um número inteiro, de -10 à 500;
 */
package exercicio2.numero15;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = -10;
		int numeroFinal = 500;
		int divisor = 3;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++ ){
			if ( aux % divisor ==0 ){
				System.out.println(aux);
				
			}
			
		}
		
	}

}
