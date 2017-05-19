/*
 * Imprima apenas números que se divididos por 5 o resultado seja maior que 3, de 10 à 1000;
 */
package exercicio2.numero16;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = 10;
		int numeroFinal = 1000;
		int divisor = 5;
		int maiorQue = 3;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++ ){
			if ( ( aux / divisor) > maiorQue ){

				System.out.println(aux);
				
			}
		}
		
	}
}
