package Lista01;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Exercicio23 extends JApplet{
	public void init (){
		String saida="";
		boolean num=false;
		
		String entrada = JOptionPane.showInputDialog("Digite um Número:");  
		int numerorecebido = Integer.parseInt(entrada);
		num = numPerfeito(numerorecebido);

		if (num){
			saida += "O número informado  é perfeito.\n";
			}
		else 
			saida += "O número informado não é perfeito.\n";
		for (int i = 1; i < 1000; i++){
		num = numPerfeito(i);
		if (num){
		saida += i + ", ";
		}
		}
		
		JOptionPane.showMessageDialog(null,saida + " são os números perfeitos menores que 1000.");
	}

	private static boolean numPerfeito(int i) {
		boolean saida = false;
		int soma=0;
		for (int j = 1; j < i; j++){
			if (i%j==0){
				soma += j;
			}
		}
		if (soma==i){
			saida = true;
		}
		soma = 0;
		
		return saida;
	}
}