package Exercicio06;

import javax.swing.*;
public class Exercicio06 extends JApplet{
	public void init(){
		
		String a;
		int k;
		
		while(true){
			a = JOptionPane.showInputDialog("1 - Calcular área de um quadrado\n2 - Calcular área de um círculo\n3 - Calcular área de um triângulo\n4 - Sair");
			k = Integer.parseInt(a);
			if(k==1){
				quadrado();
			}
			if(k==2){
				raio();
			}
			if(k==3){
				triangulo();
			}
			if(k==4){
				break;
			}
		}
	}
	public static void quadrado(){
		
		double area, lado = 0;
		String entrada;
		
		entrada = JOptionPane.showInputDialog("Digite o lado do quadrado : ");
		lado = Double.parseDouble(entrada);
		
		area = lado*lado;
		
		JOptionPane.showMessageDialog(null, "A área é : "+area);
	}
	public static void raio(){
		
		String entrada;
		double raio, area;
		
		entrada = JOptionPane.showInputDialog("Digite o raio da circunferência : ");
		raio = Double.parseDouble(entrada);
		
		area = 3.14*raio*raio;
		
		JOptionPane.showMessageDialog(null, "A área é : "+area);
	}
	public static void triangulo(){
		
		String a,b;
		double area,base,altura;
		
		b = JOptionPane.showInputDialog("Digite a base do triangulo : ");
		base = Double.parseDouble(b);
		a = JOptionPane.showInputDialog("Digite a altura do triangulo : ");
		altura = Double.parseDouble(a);
		
		area = base*altura/2;
		
		JOptionPane.showMessageDialog(null, "A área é : "+area);
	}
}
