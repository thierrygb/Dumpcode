package Lista01;

import javax.swing.*;
public class Exercicio15 extends JApplet{
	public void init(){
		String entrada;
		int x,y,cont=0;
		x=aleatorio();
		while(true){
			entrada=JOptionPane.showInputDialog("Digite um número: ");
			y=Integer.parseInt(entrada);
			if(y==x){
				JOptionPane.showMessageDialog(null, "Parabêns, você acertou o número ");
				break;
			}
		}
	}
	public static int aleatorio(){
		int x=0;
			x = 1 + (int)(Math.random()*10);
		return (int) x;
	}
}