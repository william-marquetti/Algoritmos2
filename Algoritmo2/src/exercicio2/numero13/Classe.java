/*
 * Imprima somente n�meros divis�veis por 5, de 1000 � 0;

 */
package exercicio2.numero13;

public class Classe {
	
	public static void main(String[] args) {
		
		int numeroInicial = 1000;
		int numeroFinal = 0;
		int divisor = 5;
		
		for ( int aux = numeroInicial; aux >= numeroFinal; aux-- ){
			
			if ( aux % divisor == 0){
				System.out.println(aux);
				
			}
		}
	}

}
