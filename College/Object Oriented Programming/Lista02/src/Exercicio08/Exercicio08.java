package Exercicio08;

import javax.swing.*;
import java.awt.Graphics;
public class Exercicio08 extends JApplet{
	
	int x = 0;
	
	public void init(){
		String num = JOptionPane.showInputDialog("Digite o numero de circulos que deseja");
		x=Integer.parseInt(num);
	}
	public void paint(Graphics g){
		super.paint(g); 
		for(int i=0; i<x; i++){
			g.drawOval(i*20  ,  i*20  ,  30  ,  30);
		}	
	}
}