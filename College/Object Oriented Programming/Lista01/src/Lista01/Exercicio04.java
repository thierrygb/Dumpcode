package Lista01;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int i = 0;
		
		String num1 = JOptionPane.showInputDialog("Digite um numero: ");
		int x = Integer.parseInt(num1);
		
		do {
			i++;
			JOptionPane.showMessageDialog(null,Math.pow(i, 2));
		}while(i!=x);		
	}
}