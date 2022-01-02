package Lista01;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite um número: ");
		int n1 = Integer.parseInt(num1);
		
		int sum = 0;
		
		for(int i =1; i<=n1; i++){
			sum += i;
		}
		JOptionPane.showMessageDialog(null,"O somatorio de "+n1+" é "+sum+".");
	}
}