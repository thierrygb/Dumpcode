package Lista01;

import javax.swing.*;
import java.awt.Graphics;
public class Exercicio14 extends JApplet{
	int x=0;
	public void init(){
		x=1;
	}
	public void paint(Graphics g){
		super.paint(g); 
		for(int i=0;i<x;i++){
			g.drawOval(i*1  ,  i*1  ,  1  ,  1);
		}	
	}
}