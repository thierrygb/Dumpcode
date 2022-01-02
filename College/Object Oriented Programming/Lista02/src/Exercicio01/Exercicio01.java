package Exercicio01;

import javax.swing.*;
public class Exercicio01 {
	public static void main(String args[])
	{
		String inicial, juros, meses;
		int n;
		double vp, vf, j;
	
		inicial = JOptionPane.showInputDialog("Digite o valor inicial: ");
		juros = JOptionPane.showInputDialog("Digite a taxa de juros em decimal: ");
		
		meses = JOptionPane.showInputDialog("Quantos meses o capital será aplicado");
		vp = Double.parseDouble(inicial);
		
		j = Double.parseDouble(juros);
		n=Integer.parseInt(meses);
		vf= vp*Math.pow((1+j),n);
	
		JOptionPane.showMessageDialog(null,"O valor final sera: R$ "+vf);
		System.exit(0);
	}
}