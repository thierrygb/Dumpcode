package Lista01;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		int x = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		int y = Integer.parseInt(num2);
		
		if(x==y)
			JOptionPane.showMessageDialog(null,"Os números são iguais");
		if(x>y)
			JOptionPane.showMessageDialog(null, x+" é maior que "+y);
		if (x<y)
			JOptionPane.showMessageDialog(null, x+" é menor que "+y);
	}

}