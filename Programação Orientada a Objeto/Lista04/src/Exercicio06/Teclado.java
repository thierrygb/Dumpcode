package Exercicio06;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Teclado extends JFrame{

		JButton botao0,botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9,botaovalidar;
		
		public Teclado(){
		
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			
			botao1 = new JButton();
			botao1.setText("1");
			botao1.setBounds(15,15,45,30);
			telainicial.add(botao1);
			
			botao2 = new JButton();
			botao2.setText("2");
			botao2.setBounds(75,15,45,30);
			telainicial.add(botao2);
			
			botao3 = new JButton();
			botao3.setText("3");
			botao3.setBounds(135,15,45,30);
			telainicial.add(botao3);
			
			botao4 = new JButton();
			botao4.setText("4");
			botao4.setBounds(195,15,45,30);
			telainicial.add(botao4);
			
			botao5 = new JButton();
			botao5.setText("5");
			botao5.setBounds(255,15,45,30);
			telainicial.add(botao5);
			setVisible(true);
			
			botao6 = new JButton();
			botao6.setText("6");
			botao6.setBounds(15,60,45,30);
			telainicial.add(botao6);
			
			botao7 = new JButton();
			botao7.setText("7");
			botao7.setBounds(75,60,45,30);
			telainicial.add(botao7);
			
			botao8 = new JButton();
			botao8.setText("8");
			botao8.setBounds(135,60,45,30);
			telainicial.add(botao8);
			
			botao9 = new JButton();
			botao9.setText("9");
			botao9.setBounds(195,60,45,30);
			telainicial.add(botao9);
			
			botao0 = new JButton();
			botao0.setText("0");
			botao0.setBounds(255,60,45,30);
			telainicial.add(botao0);
			setVisible(true);
		}
		public static void main(String[] args) {
			Teclado tela = new Teclado();
			tela.setVisible(true);
			tela.setBounds(0,0, 320,140);
		}
}		


