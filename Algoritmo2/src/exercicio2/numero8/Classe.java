/*
 * Imprima apenas n�mero m�ltiplos de 2, de 0 at� o n�mero digitado pelo usu�rio;
 */
package exercicio2.numero8;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		
		for ( int aux = 0; aux <= numero; aux++){
			
			if( (aux % 2 == 0)){
				System.out.println(aux);
				
			}

		}
	}

}
