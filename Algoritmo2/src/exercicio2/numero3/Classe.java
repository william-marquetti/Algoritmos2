/*
 * Imprima no console uma lista de 20 a 100, e no lugar do n�mero 25 imprima �Ol�;
 */
package exercicio2.numero3;

public class Classe {
	public static void main(String[] args) {
		
		int maximo = 100;
		
		for ( int aux = 20; aux <= maximo; aux++ ){
			
			if (aux == 25){
				System.out.println("Ol�");
			}else{
				System.out.println(aux);
			}
			
		}
	}

}
