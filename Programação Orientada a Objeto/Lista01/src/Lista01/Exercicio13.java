package Lista01;

import javax.swing.*;
import java.awt.Graphics;
public class Exercicio13 extends JApplet{
	int x=0;
	public void init(){
		x=10;
	}
	public void paint(Graphics g){
		super.paint(g); 
		for(int i=0;i<x;i++){
			g.drawOval(i*20  ,  i*20  ,  30  ,  30);
		}	
	}
}