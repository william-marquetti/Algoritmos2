/*
 * mprimir uma lista semelhante a lista abaixo:
		1_10
		 2_9
		 3_8
		 4_7
		 5_6
		 6_5
		 7_4
		 8_3
		 9_2
		10_1

 */
package exercicio2.numero17;

public class Classe {
	public static void main(String[] args) {
		
		int numeroInicial = 1;
		int numeroFinal = 10;
		int numeroInicial2 = numeroFinal;
		
		for ( int aux = numeroInicial; aux <= numeroFinal; aux++){
			System.out.println(aux + "_" + numeroInicial2);
			numeroInicial2--;
			
		}
		
		
	}

}
