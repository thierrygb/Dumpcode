package Lista01;

import javax.swing.JOptionPane;


public class Exercicio07 {
	
	public static void main(String[] args) {
		String saida = "";
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++)
				saida = saida + "*";
			saida += "\n";
		}
		JOptionPane.showMessageDialog(null,saida);
	}

}