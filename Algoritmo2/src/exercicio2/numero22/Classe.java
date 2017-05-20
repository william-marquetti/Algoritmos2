/*
 * 
 * Desenhe a seguinte pir�mide de n�meros. O usu�rio determina a quantidade de linhas. Necessitar� de 2 for.
		01
		02 02  
		03 03 03  
		04 04 04 04  
		05 05 05 05 05  
		06 06 06 06 06 06  
		07 07 07 07 07 07 07  
		08 08 08 08 08 08 08 08  
		09 09 09 09 09 09 09 09 09  
		10 10 10 10 10 10 10 10 10 10  
		11 11 11 11 11 11 11 11 11 11 11
 */

package exercicio2.numero22;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {

		int linhas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de linhas."));

		// controle das linhas
		for (int aux = 0; aux <= linhas; aux++) {

			// controle das colunas
			for (int aux2 = 1; aux2 <= aux; aux2++) {

				// se o numero da linha for menor que 10, adiciona o 0 na a
				// esquerda
				if (aux < 10) {
					System.out.print("0" + aux + " ");
				} else {
					System.out.print(aux + " ");
				}

			}

			System.out.println("");
		}
	}

}
