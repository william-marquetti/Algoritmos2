/*
 * Imprima apenas n�meros m�ltiplos de 3, do n�mero digitado pelo usu�rio;
 */

package exercicio2.numero9;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		for ( int aux = 0; aux <= numero; aux++){
			
			if( (aux % 3 == 0) ){
				System.out.println(aux);
				
			}

		}
	}
	

}
