package Lista01;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		String  num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		float x = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		float y = Integer.parseInt(num2);
		
		float soma = x+y;
		float subtracao = x-y;
		float multiplicacao = x*y;
		float divisao = x/y;
		
		JOptionPane.showMessageDialog(null, "Soma: "+soma+"\nSubtração: "+subtracao+"\nMultiplicação: "+multiplicacao+"\nDivisão: "+divisao);

	}

}