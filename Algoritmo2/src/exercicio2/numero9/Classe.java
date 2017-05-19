/*
 * Imprima apenas números múltiplos de 3, do número digitado pelo usuário;
 */

package exercicio2.numero9;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		for ( int aux = 0; aux <= numero; aux++){
			
			if( (aux % 3 == 0) ){
				System.out.println(aux);
				
			}

		}
	}
	

}
