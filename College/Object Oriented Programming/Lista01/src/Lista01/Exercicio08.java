package Lista01;

import javax.swing.JOptionPane;

public class Exercicio08 {
	
	public static void main(String[] args) {
		
		float media=0;
		float total=0;		
		int x = 0;
		int sair = 0;
		do {
			x++;
			String salario = JOptionPane.showInputDialog("Digite os salários e -1 para sair: ");
			int s = Integer.parseInt(salario);
			if(s>0) {
				total+=s;
				media=total/x;
			}
			sair=s;
		}while(sair != -1);
		
		JOptionPane.showMessageDialog(null, "A média salarial é: "+media);
	}
}
