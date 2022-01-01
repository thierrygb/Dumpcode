package Exercicio02;

import javax.swing.*;
public class Exercicio02 {
	public static void main(String[] args) {
		
		String horas, vhora, dep, desconto;
		float salario,h,vh,ndep,desc;
		
		horas = JOptionPane.showInputDialog("Numero de horas trabalhadas: ");
		vhora = JOptionPane.showInputDialog("Valor da hora: ");
		h = Float.parseFloat(horas);
		vh = Float.parseFloat(vhora);

		dep = JOptionPane.showInputDialog("Numero de dependentes: ");
		desconto = JOptionPane.showInputDialog("Valor dos descontos: ");		
		ndep = Float.parseFloat(dep);
		desc = Float.parseFloat(desconto);
		
		salario = h*vh+(50*ndep)-desc;
		
		JOptionPane.showMessageDialog(null, "O salário será de R$ "+salario);
		
		
	}

}