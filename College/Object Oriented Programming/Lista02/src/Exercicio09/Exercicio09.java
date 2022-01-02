package Exercicio09;

import javax.swing.*;
public class Exercicio09 extends JApplet{
	public void init(){
		
		String a,b,c;
		int c1;
		double a1,b1,conv;
		
		a = JOptionPane.showInputDialog("Informe quantos reais valem um dólar: ");
		a1 = Double.parseDouble(a);
		
		while(true){
			
			b = JOptionPane.showInputDialog("Informe quantos reais deseja converter: ");
			b1 = Double.parseDouble(b);
			
			conv = converte(a1,b1);
			
			JOptionPane.showMessageDialog(null, "O valor corresponde a $: "+conv);
			c = JOptionPane.showInputDialog("Aperte 1 para sair: ");
			c1 = Integer.parseInt(c);
			if(c1==1) break;
		}
	}
	public static double converte(double a1,double b1){
		return b1/a1;
	}
}