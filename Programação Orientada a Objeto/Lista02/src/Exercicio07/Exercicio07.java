package Exercicio07;

import javax.swing.*;
public class Exercicio07 extends JApplet{
	public void init(){
		
		String entrada;
		int x,y,cont=0;
		x=aleatorio();
		
		while(true){
			entrada=JOptionPane.showInputDialog("Digite um número(entre 1 e 100) : ");
			y=Integer.parseInt(entrada);
			if(y>x){
				JOptionPane.showMessageDialog(null,"Número maior que o desejado!");
				cont++;
			}
			if(y<x){
				JOptionPane.showMessageDialog(null,"Número menor que o desejado");
				cont++;
			}
			if(y==x){
				JOptionPane.showMessageDialog(null, "Parabêns, você acertou o número com "+cont+" tentativas");
				break;
			}
		}
	}
	public static int aleatorio(){
		int x=0;
		x = 1 + (int)(Math.random() * 100);
		return (int) x;
	}
}