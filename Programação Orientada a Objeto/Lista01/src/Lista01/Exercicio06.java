package Lista01;

import javax.swing.JOptionPane;


public class Exercicio06 {
	
	public static void main(String[] args) {
		String saida = "";
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++)
				saida = saida + "*";
			saida += "\n";
		}
		JOptionPane.showMessageDialog(null,saida);
	}

}