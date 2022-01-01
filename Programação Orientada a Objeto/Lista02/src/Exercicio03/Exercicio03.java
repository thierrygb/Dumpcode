package Exercicio03;

import javax.swing.*;
public class Exercicio03 extends JApplet {
	public void init(){
		
		String x, y;
		int num;
		double c, f;
		
		x = JOptionPane.showInputDialog("Digite a temperatura:");
		y = JOptionPane.showInputDialog("1.Conversão Celsius Fahrenheit\n"+"2.Conversão Fahrenheit Celsius");
		num = Integer.parseInt(y);
		
		switch(num){
		case 1:
			c = Integer.parseInt(x);
			f = celsius(c);
			JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: "+f+"°");
			break;
		
		case 2:
			f = Integer.parseInt(x);
			c = fahrenheit(f);
			JOptionPane.showMessageDialog(null, "Temperatura em Celsius: "+c+"°");
			break;
		
		default:
			break;
		}
	}
	public static double celsius(double c){
		return(double) 9.0/5.0*(c+32);
	}
	public static double fahrenheit(double f){
		return(double) 5.0/9.0*(f-32);
	}
}
