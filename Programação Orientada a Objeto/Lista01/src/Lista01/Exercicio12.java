package Lista01;

import javax.swing.*;
public class Exercicio12 extends JApplet {
	public void init(){
		String cateto1,cateto2;
		Double cat1,cat2,a;
		cateto1=JOptionPane.showInputDialog("Digite o cateto 1: ");
		cateto2=JOptionPane.showInputDialog("Digite o cateto 2: ");
		cat1=Double.parseDouble(cateto1);
		cat2=Double.parseDouble(cateto2);
		
		a=hipotenusa(cat1,cat2);
		JOptionPane.showMessageDialog(null, "Hipotenusa: "+a);
	
	}
public static double hipotenusa(Double cateto1, Double cateto2){
	double a;
	a=Math.pow(cateto1,2)+Math.pow(cateto2,2);
	a=Math.sqrt(a);
	return a;
}
}