/*
 * Imprima apenas número múltiplos de 2, de 0 até o número digitado pelo usuário;
 */
package exercicio2.numero8;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		for ( int aux = 0; aux <= numero; aux++){
			
			if( (aux % 2 == 0)){
				System.out.println(aux);
				
			}

		}
	}

}
