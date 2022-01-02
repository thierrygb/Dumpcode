package Exercicio10;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class Principal extends JApplet{


	public void paint(Graphics g) {
		super.paint(g);
		NoSensor[] vet = new NoSensor[20];
		int resp = 0;
		int i=0;
		
		for(int j=0;j<vet.length;j++)
		{
			vet[j]=null;
		}
		
		while ((resp==0)&&(i<20)) {
			
		
		String op1 = JOptionPane.showInputDialog(" 1- Inserir um nó do tipo Telos \n 2- Inserir um nó do tipo Mica \n 3- Exibir a rede e sair");
		int option = Integer.parseInt(op1);
		
		switch (option) {
	case 1:
		
		String ent1 = JOptionPane.showInputDialog(" Informe x ");
		String ent2 = JOptionPane.showInputDialog(" Informe y");
		String ent3 = JOptionPane.showInputDialog(" Informe id");
		String ent4 = JOptionPane.showInputDialog(" Informe a temperatura do sensor ");
		
		int temp = Integer.parseInt(ent4);
		int xes = Integer.parseInt(ent1);
		int ypslon = Integer.parseInt(ent2);
		
		vet[i]= new Telos(temp, xes, ypslon, ent3);
		i++;
		break;

case 2:
	String ent5 = JOptionPane.showInputDialog(" Informe x ");
	String ent6 = JOptionPane.showInputDialog(" Informe y");
	String ent7 = JOptionPane.showInputDialog(" Informe id");
	String ent8 = JOptionPane.showInputDialog(" Informe o ruido do sensor ");
	
	int ruido = Integer.parseInt(ent8);
	int xese = Integer.parseInt(ent5);
	int ypslone = Integer.parseInt(ent6);
	
	vet[i]= new Telos(ruido, xese, ypslone, ent7);
	i++;
	
		break;
		
case 3:
		for (int k = 0; k < vet.length; k++) {
			if (vet[k]!=null) {
				g.drawOval(vet[k].getX(),vet[k].getY(), 50, 50);
				}
			
		}
	break;
	
	
	default:
		break;
	}
		resp = JOptionPane.showConfirmDialog(null, " Deseja voltar ao menu principal? ");
		}
		}
	
	}