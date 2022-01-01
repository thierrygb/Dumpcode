package Exercicio02;
import javax.swing.*;
import java.awt.Graphics;
public class Principal extends JApplet {
	Sonda s1;
	Sonda s2;
	public void init(){
		String entrada;
		s1= new Sonda();
		s2= new Sonda();
		
		entrada=JOptionPane.showInputDialog("Digite o nome da primeira sonda.");
		s1.setNome(entrada);
		entrada=JOptionPane.showInputDialog("Digite a latitude da primeira sonda.(Entre 0 e 90)");
		s1.setLat(Integer.parseInt(entrada));
		entrada=JOptionPane.showInputDialog("Digite a longitude da primeira sonda.(Entre 0 e 180)");
		s1.setLongi(Integer.parseInt(entrada));
		entrada=JOptionPane.showInputDialog("Digite o nome da segunda sonda.");
		s2.setNome(entrada);
		entrada=JOptionPane.showInputDialog("Digite a latitude da segunda sonda.(Entre 0 e 90)");
		s2.setLat(Integer.parseInt(entrada));
		entrada=JOptionPane.showInputDialog("Digite a longitude da segunda sonda.(Entre 0 e 180)");
		s2.setLongi(Integer.parseInt(entrada));
	}
	public void paint (Graphics g){
		g.drawOval(s1.getLongi(),s1.getLat(),6,6);
		g.drawString(s1.getNome(), s1.getLongi(), s1.getLat());
		g.drawOval(s2.getLongi(), s2.getLat(),6,6);
		g.drawString(s2.getNome(),s2.getLongi(),s2.getLat());
	}
}