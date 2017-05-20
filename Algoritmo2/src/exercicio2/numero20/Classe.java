/*
 * Perguntar para o usuário o início da lista e o final da lista que ele quer se 
 * seja impressa e imprimir esta lista.
 */
package exercicio2.numero20;

import javax.swing.JOptionPane;

public class Classe {
	public static void main(String[] args) {
		
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial"));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero final"));
		int imprimir = JOptionPane.showConfirmDialog(null, "Deseja imprimir?");
		
		if ( imprimir == 0){
			for (int aux = inicio; aux <= fim; aux++){
				System.out.println(aux);
			}
		}

		
	}
}
