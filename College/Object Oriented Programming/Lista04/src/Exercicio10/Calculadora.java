package Exercicio10;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

		JButton botao0,botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botaosoma, botaosubtracao, botaomultiplicacao, botaodivisao, botaoigual;
		JTextArea display;
		String textododisplay = "";
		String termo1;
		String termo2 = "";
		int termo1int,termo2int;
		int cont1 = 0;
		int cont2 = 0;
		public Calculadora(){
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			Manipulador objetolistener = new Manipulador();
			
			botao1 = new JButton();
			botao1.setText("1");
			botao1.setBounds(15,420,50,30);
			botao1.addActionListener(objetolistener);		
			telainicial.add(botao1);
			
			botao2 = new JButton();
			botao2.setText("2");
			botao2.setBounds(115,420,50,30);
			botao2.addActionListener(objetolistener);		
			telainicial.add(botao2);
			
			botao3 = new JButton();
			botao3.setText("3");
			botao3.setBounds(215,420,50,30);
			botao3.addActionListener(objetolistener);		
			telainicial.add(botao3);
			
			botao4 = new JButton();
			botao4.setText("4");
			botao4.setBounds(315,420,50,30);
			botao4.addActionListener(objetolistener);		
			telainicial.add(botao4);
			
			botao5 = new JButton();
			botao5.setText("5");
			botao5.setBounds(415,420,50,30);
			botao5.addActionListener(objetolistener);		
			telainicial.add(botao5);
			setVisible(true);
			
			botao6 = new JButton();
			botao6.setText("6");
			botao6.setBounds(15,300,50,30);
			botao6.addActionListener(objetolistener);		
			telainicial.add(botao6);
			
			botao7 = new JButton();
			botao7.setText("7");
			botao7.setBounds(115,300,50,30);
			botao7.addActionListener(objetolistener);		
			telainicial.add(botao7);
			
			botao8 = new JButton();
			botao8.setText("8");
			botao8.setBounds(215,300,50,30);
			botao8.addActionListener(objetolistener);		
			telainicial.add(botao8);
			
			botao9 = new JButton();
			botao9.setText("9");
			botao9.setBounds(315,300,50,30);
			botao9.addActionListener(objetolistener);		
			telainicial.add(botao9);
			
			botao0 = new JButton();
			botao0.setText("0");
			botao0.setBounds(415,300,50,30);
			botao0.addActionListener(objetolistener);		
			telainicial.add(botao0);
			setVisible(true);
			
			botaosoma = new JButton();
			botaosoma.setText("+");
			botaosoma.setBounds(15,180,50,30);
			botaosoma.addActionListener(objetolistener);		
			telainicial.add(botaosoma);
			
			botaosubtracao = new JButton();
			botaosubtracao.setText("-");
			botaosubtracao.setBounds(115,180,50,30);
			botaosubtracao.addActionListener(objetolistener);		
			telainicial.add(botaosubtracao);
			
			botaomultiplicacao = new JButton();
			botaomultiplicacao.setText("*");
			botaomultiplicacao.setBounds(215,180,50,30);
			botaomultiplicacao.addActionListener(objetolistener);		
			telainicial.add(botaomultiplicacao);
			
			botaodivisao = new JButton();
			botaodivisao.setText("/");
			botaodivisao.setBounds(315,180,50,30);
			botaodivisao.addActionListener(objetolistener);		
			telainicial.add(botaodivisao);
			
			botaoigual = new JButton();
			botaoigual.setText("=");
			botaoigual.setBounds(415,180,50,30);
			botaoigual.addActionListener(objetolistener);		
			telainicial.add(botaoigual);
			setVisible(true);
			
			display = new JTextArea();
			display.setText("");
			display.setBounds(20, 20, 440, 140);
			telainicial.add(display);
			
		}
		public static void main(String[] args) {
			Calculadora tela = new Calculadora();
			tela.setVisible(true);
			tela.setBounds(0,0, 500,500);
		}
		public class Manipulador implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botao1){
					textododisplay+=botao1.getText();
					display.setText(textododisplay);
					cont1++;
					cont2++;
				}
				if (event.getSource() == botao2){
					textododisplay+=botao2.getText();
					display.setText(textododisplay);
					cont1++;
					cont2++;
				}
				if (event.getSource() == botao3){
					textododisplay+=botao3.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}
				if (event.getSource() == botao4){
					textododisplay+=botao4.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}
				if (event.getSource() == botao5){
					textododisplay+=botao5.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}
				if (event.getSource() == botao6){
					textododisplay+=botao6.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}	
				if (event.getSource() == botao7){
					textododisplay+=botao7.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}	
				if (event.getSource() == botao8){
					textododisplay+=botao8.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}	
				if (event.getSource() == botao9){
					textododisplay+=botao9.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}
				if (event.getSource() == botao0){
					textododisplay+=botao0.getText();
					display.setText(textododisplay);
					cont2++;
					cont1++;
				}
				if (event.getSource() == botaosoma){
					termo1 = textododisplay;
					termo1int = Integer.parseInt(termo1);
					textododisplay+=botaosoma.getText();
					
					display.setText(textododisplay);
					cont2++;
					
				}	
				if (event.getSource() == botaosubtracao){
					termo1 = textododisplay;
					termo1int = Integer.parseInt(termo1);
					textododisplay+=botaosubtracao.getText();
					
					display.setText(textododisplay);
					cont2++;
				}
				if (event.getSource() == botaomultiplicacao){
					termo1 = textododisplay;
					termo1int = Integer.parseInt(termo1);
					textododisplay+=botaomultiplicacao.getText();
					display.setText(textododisplay);
					cont2++;
				}
				if (event.getSource() == botaodivisao){
					termo1 = textododisplay;
					termo1int = Integer.parseInt(termo1);
					textododisplay+=botaodivisao.getText();
					display.setText(textododisplay);
					cont2++;
				}
				if (event.getSource() == botaoigual){
					textododisplay+=botaoigual.getText();
					for(int i = (1+termo1.length()); i<cont2; i++){
						termo2 += textododisplay.charAt(i);
					}
					termo2int = Integer.parseInt(termo2);
					char sinal = textododisplay.charAt(termo1.length()); 
					if(sinal == '+'){
						int soma = termo1int + termo2int;
						textododisplay+=soma;					
					}else if(sinal == '-'){
						int subtracao = termo1int - termo2int;
						textododisplay+=subtracao;					
					}else if(sinal == '*'){
						int multiplicacao = termo1int * termo2int;
						textododisplay+=multiplicacao;					
					}else if(sinal == '/'){
						if (termo2int==0){
							textododisplay = "ERRO - DIVISÃO POR ZERO";
						}else{
							int divisao = termo1int / termo2int;
							textododisplay+=divisao;						
						}					
					}
					display.setText(textododisplay);
				}	
			}
		}		
	}

