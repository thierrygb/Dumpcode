package Exercicio09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JogodaVelha extends JFrame{

		JButton botao11,botao12, botao13, botao21, botao22, botao23, botao31, botao32, botao33, botaolimpar;
		JTextArea display;
		String xo = "X";
		
		public JogodaVelha(){
			
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			Manipulador objetolistener = new Manipulador();
			
			botao11 = new JButton();
			botao11.setBounds(20,20, 45, 45);
			botao11.addActionListener(objetolistener);
			telainicial.add(botao11);
			
			botao12 = new JButton();
			botao12.setBounds(70,20, 45, 45);
			botao12.addActionListener(objetolistener);
			telainicial.add(botao12);
			
			botao13 = new JButton();
			botao13.setBounds(120,20, 45, 45);
			botao13.addActionListener(objetolistener);
			telainicial.add(botao13);
			
			botao21 = new JButton();
			botao21.setBounds(20, 70, 45, 45);
			botao21.addActionListener(objetolistener);
			telainicial.add(botao21);
			
			botao22 = new JButton();
			botao22.setBounds(70, 70, 45, 45);
			botao22.addActionListener(objetolistener);
			telainicial.add(botao22);
			
			botao23 = new JButton();
			botao23.setBounds(120,70, 45, 45);
			botao23.addActionListener(objetolistener);
			telainicial.add(botao23);
			
			botao31 = new JButton();
			botao31.setBounds(20,120, 45, 45);
			botao31.addActionListener(objetolistener);
			telainicial.add(botao31);
			
			botao32 = new JButton();
			botao32.setBounds(70,120, 45, 45);
			botao32.addActionListener(objetolistener);
			telainicial.add(botao32);
			
			botao33 = new JButton();
			botao33.setBounds(120,120, 45, 45);
			botao33.addActionListener(objetolistener);
			telainicial.add(botao33);
			
			botaolimpar = new JButton();
			botaolimpar.setBounds(20,175, 145, 45);
			botaolimpar.addActionListener(objetolistener);
			botaolimpar.setText("Limpar");
			telainicial.add(botaolimpar);
			
			display = new JTextArea();
			display.setBounds(20, 235, 145, 45);
			telainicial.add(display);
		}
		public static void main(String[] args) {
			JogodaVelha tela = new JogodaVelha();
			tela.setVisible(true);
			tela.setBounds(0,0, 200,340);
		}
		void testaganhador(){
			
			if(((botao11.getText()=="O")&&(botao12.getText()=="O")&&(botao13.getText()=="O"))){
				display.setText("O - Ganhou");
			}else if(((botao11.getText()=="X")&&(botao12.getText()=="X")&&(botao13.getText()=="X"))){
				display.setText("X - Ganhou");
			}else 
		
				if(((botao21.getText()=="O")&&(botao22.getText()=="O")&&(botao23.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao21.getText()=="X")&&(botao22.getText()=="X")&&(botao23.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
			
				if(((botao31.getText()=="O")&&(botao32.getText()=="O")&&(botao33.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao31.getText()=="X")&&(botao32.getText()=="X")&&(botao33.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
				
				if(((botao11.getText()=="O")&&(botao21.getText()=="O")&&(botao31.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao11.getText()=="X")&&(botao21.getText()=="X")&&(botao31.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
			
				if(((botao12.getText()=="O")&&(botao22.getText()=="O")&&(botao32.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao12.getText()=="X")&&(botao22.getText()=="X")&&(botao32.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
			
				if(((botao13.getText()=="O")&&(botao23.getText()=="O")&&(botao33.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao13.getText()=="X")&&(botao23.getText()=="X")&&(botao33.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
			
				if(((botao11.getText()=="O")&&(botao22.getText()=="O")&&(botao33.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao11.getText()=="X")&&(botao22.getText()=="X")&&(botao33.getText()=="X"))){
				display.setText("X - Ganhou");
			}else
			
				if(((botao13.getText()=="O")&&(botao22.getText()=="O")&&(botao31.getText()=="O"))){
				display.setText("0 - Ganhou");
			}else if(((botao13.getText()=="X")&&(botao22.getText()=="X")&&(botao31.getText()=="X"))){
				display.setText("X - Ganhou");
			}else{display.setText("Empate");}
		}
		public class Manipulador implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botao11){
					if (botao11.getText()==""){
						botao11.setText(xo);
						
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao12){
					if (botao12.getText()==""){
						botao12.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao13){
					if (botao13.getText()==""){
						botao13.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao21){
					if (botao21.getText()==""){
						botao21.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao22){
					if (botao22.getText()==""){
						botao22.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao23){
					if (botao23.getText()==""){
						botao23.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao31){
					if (botao31.getText()==""){
						botao31.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao32){
					if (botao32.getText()==""){
						botao32.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botao33){
					if (botao33.getText()==""){
						botao33.setText(xo);
						if(xo.contains("X")){
							xo = "O";
						}else{
							xo = "X";
						}
					}
					testaganhador();
				}
				if (event.getSource() == botaolimpar){
					xo="X";
					display.setText("");				
					botao11.setText("");
					botao12.setText("");
					botao13.setText("");
					botao21.setText("");
					botao22.setText("");
					botao23.setText("");
					botao31.setText("");
					botao32.setText("");
					botao33.setText("");
				}				
				
			}
		}
	}		