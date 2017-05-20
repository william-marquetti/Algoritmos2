/*
 * Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
	1
	1 1  
	1 1 1  
	1 1 1 1
	1 1 1 1 1
	1 1 1 1 1 1  

 */
package exercicio2.numero21;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		
		int linhas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas."));
		
		for ( int aux = 0 ; aux <= linhas; aux++ ){
			for (int aux2 = 0; aux2 <= aux; aux2++){
				System.out.print("1 ");
			}
			
			System.out.println("");
		}
	}

}
