package Lista01;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Exercicio24  extends JApplet{
	 
	public void init() {
	float num, saida,continuar=0;
	    	  
	do{
	  		  
		String entrada = JOptionPane.showInputDialog("Informe um número:\n");  
		num = Integer.parseInt(entrada);
		saida = Fatorial(num);
	  			
		JOptionPane.showMessageDialog(null, "FATORIAL\n" + num + "! = " + saida +".");
		continuar = JOptionPane.showConfirmDialog(null, "Deseja calcular o fatorial de mais algum número?");
	    } while(continuar == 0);
	    	  
			exit(1);
			
		}

		private void exit(int i) {
					
		}

		public float Fatorial(float n) {
		if ((n==1) || (n==0)) 
		return 1;            
		else return n*Fatorial(n-1);
				
		}
	}
