package Lista01;

import javax.swing.*;
public class Exercicio10 extends JApplet {
	public void init()
	{
		String a,b,c,aux;
		double a1,b1,c1,i=1,x1,x2, delta;
		while(i==1)
		{
			a=JOptionPane.showInputDialog("Digite o valor de a");
			b=JOptionPane.showInputDialog("Digite o valor de b");
			c=JOptionPane.showInputDialog("Digite o valor de c");
			
			a1=Double.parseDouble(a);
			b1=Double.parseDouble(b);
			c1=Double.parseDouble(c);
			
			delta=Math.pow(b1,2)-4*a1*c1;
			if(delta<0){
				JOptionPane.showMessageDialog(null, "Delta negativo.");
		
			}
			else
			{
				x1=(-b1+Math.sqrt(delta))/(2*a1);
				x2=(-b1-Math.sqrt(delta))/(2*a1);
				JOptionPane.showMessageDialog(null, "O valor de x1 é: "+x1+" e o valor de x2 é: "+x2);
								
			}
			aux=JOptionPane.showInputDialog("Deseja repetir a operação?\n"+"1:Sim\n"+"2:Não");
			i=Double.parseDouble(aux);
		}
		
	}

}