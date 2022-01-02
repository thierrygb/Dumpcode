package Lista01;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String idade = JOptionPane.showInputDialog("Digite sua idade: ");
		JOptionPane.showMessageDialog(null,nome+ " você tem " +idade+ " anos");
	
	}

}