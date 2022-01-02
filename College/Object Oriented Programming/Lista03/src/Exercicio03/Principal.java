package Exercicio03;
import java.awt.Graphics;
import javax.swing.*;
public class Principal extends JApplet {
	int max = 4;
	Jogador jog[] = new Jogador[100];
	public void init (){
		for (int i = 0;i<max;i++){
			Jogador aux = new Jogador ();
			String e = JOptionPane.showInputDialog("Digite o nome e o time do jogador");
			aux.setNome(e);
			e = JOptionPane.showInputDialog("Digite a posição jogador no eixo x");
			int p = Integer.parseInt(e);
			aux.setPos01(p);
			e = JOptionPane.showInputDialog("Digite a posição jogador no eixo x");
			 p = Integer.parseInt(e);
			aux.setPos02(p);
			jog[i]=aux;
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		for (int c =0; c <max; c++){
			g.drawString(jog[c].getNome(), jog[c].getPos01()+2,jog[c].getPos02()+2);
			g.drawOval(jog[c].getPos01(),jog[c].getPos02(), 3	, 3);
		}
		g.drawRect( 10, 10 ,  500  ,  250);
		//Horizonta, vertical, largura , altura
		g.drawRect( 10, 35 ,  120 , 200);
		g.drawRect( 390, 35 ,  120 , 200);
		g.drawLine(260, 10, 260 , 260);
		// x inicial, y inicial, xfinal ,yfinal
		g.drawOval(220, 105, 80	, 80);
		
	}
}