/*
 * Pergunte para o usu�rio at� que n�mero ele quer imprimir, 
 * e imprima do 0 at� o n�mero desejado pelo usu�rio;
 */
package exercicio2.numero5;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite at� que n�mero voc� quer imprimir."));
		
		for ( int aux = 0; aux <= quantidade; aux++ ){
			System.out.println(aux);
		}
		
	}

}
