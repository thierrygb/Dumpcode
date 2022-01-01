package Exercicio08;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Conta extends JFrame{

		JButton botao0,botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9,botaovalidar;
		JTextArea display, textosenha;
		JTextField textoconta, textoagencia;
		String textododisplay = "";
		String senha="";
		String senhaoculta="";
		String agenciacadastrada, contacadastrada, senhacadastrada;
		
		public Conta(){
			agenciacadastrada = "1264-8";
			contacadastrada = "4851-8";
			senhacadastrada = "123456";
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			Manipulador objetolistener = new Manipulador();
			
			botao1 = new JButton();
			botao1.setText("1");
			botao1.setBounds(15,320,45,30);
			botao1.addActionListener(objetolistener);		
			telainicial.add(botao1);
			
			botao2 = new JButton();
			botao2.setText("2");
			botao2.setBounds(75,320,45,30);
			botao2.addActionListener(objetolistener);		
			telainicial.add(botao2);
			
			botao3 = new JButton();
			botao3.setText("3");
			botao3.setBounds(135,320,45,30);
			botao3.addActionListener(objetolistener);		
			telainicial.add(botao3);
			
			botao4 = new JButton();
			botao4.setText("4");
			botao4.setBounds(195,320,45,30);
			botao4.addActionListener(objetolistener);		
			telainicial.add(botao4);
			
			botao5 = new JButton();
			botao5.setText("5");
			botao5.setBounds(255,320,45,30);
			botao5.addActionListener(objetolistener);		
			telainicial.add(botao5);
			setVisible(true);
			
			botao6 = new JButton();
			botao6.setText("6");
			botao6.setBounds(15,280,45,30);
			botao6.addActionListener(objetolistener);		
			telainicial.add(botao6);
			
			botao7 = new JButton();
			botao7.setText("7");
			botao7.setBounds(75,280,45,30);
			botao7.addActionListener(objetolistener);		
			telainicial.add(botao7);
			
			botao8 = new JButton();
			botao8.setText("8");
			botao8.setBounds(135,280,45,30);
			botao8.addActionListener(objetolistener);		
			telainicial.add(botao8);
			
			botao9 = new JButton();
			botao9.setText("9");
			botao9.setBounds(195,280,45,30);
			botao9.addActionListener(objetolistener);		
			telainicial.add(botao9);
			
			botao0 = new JButton();
			botao0.setText("0");
			botao0.setBounds(255,280,45,30);
			botao0.addActionListener(objetolistener);		
			telainicial.add(botao0);
			setVisible(true);
			
			display = new JTextArea();
			display.setText("Aguardando Entrada de Dados...");
			display.setBounds(15, 20, 285, 70);
			telainicial.add(display);
			
			botaovalidar = new JButton();
			botaovalidar.setText("Validar");
			botaovalidar.setBackground(Color.green);
			botaovalidar.setBounds(15,240,285,30);
			botaovalidar.addActionListener(objetolistener);		
			telainicial.add(botaovalidar);
			
			textoagencia = new JTextField();
			textoagencia.setText("Digite o Número da Agência");
			textoagencia.setBounds(15,120,285,30);
			telainicial.add(textoagencia);
			
			textoconta = new JTextField();
			textoconta.setText("Digite o Número da Conta");
			textoconta.setBounds(15,160,285,30);
			telainicial.add(textoconta);
			
			textosenha = new JTextArea();
			textosenha.setText("Use o Teclado Virtual para Inserir a Senha");
			textosenha.setBounds(15, 200, 285, 30);
			telainicial.add(textosenha);
		}
		public static void main(String[] args) {
			Conta tela = new Conta();
			tela.setVisible(true);
			tela.setBounds(0,0, 335,400);
		}
		public class Manipulador implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botao1){
					senha+=botao1.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
				if (event.getSource() == botao2){
					senha+=botao2.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
					
				}
				if (event.getSource() == botao3){
					senha+=botao3.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
				if (event.getSource() == botao4){
					senha+=botao4.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
				if (event.getSource() == botao5){
					senha+=botao5.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
				if (event.getSource() == botao6){
					senha+=botao6.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}	
				if (event.getSource() == botao7){
					senha+=botao7.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}	
				if (event.getSource() == botao8){
					senha+=botao8.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}	
				if (event.getSource() == botao9){
					senha+=botao9.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
				if (event.getSource() == botao0){
					senha+=botao0.getText();
					senhaoculta+="*";
					textosenha.setText(senhaoculta);
				}
					
				
				if (event.getSource() == botaovalidar){
					if((textoagencia.getText().contains(agenciacadastrada))&&(textoconta.getText().contains(contacadastrada))&&(senha.contains(senhacadastrada))){
						display.setText("Dados Corretos!\nProcessando as Informações.\n Aguarde...");
					}else{		
						display.setText("Dados Incorretos!");
					}			
				
				}
			}
		}		
	}

