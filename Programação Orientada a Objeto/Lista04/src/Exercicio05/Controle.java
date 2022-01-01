package Exercicio05;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Controle extends JFrame{

	JButton botaoinserir, botaomaiscaro, botaoremover, botaototalvendas, botaolimpadisplay;
	JTextArea display;
	JTextField textoproduto, textopreco, textoremover;
	Venda venda = new Venda();
	public Controle(){
			
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			Manipulador objetolistener = new Manipulador();
			
			textoproduto = new JTextField();
			textoproduto.setBounds(20,20,170,30);
			textoproduto.setText("Digite o Nome do Produto");
			telainicial.add(textoproduto);
			
			textopreco = new JTextField();
			textopreco.setBounds(210,20,170,30);
			textopreco.setText("Digite o Preço do Produto");
			telainicial.add(textopreco);
			
			textoremover = new JTextField();
			textoremover.setBounds(20,125,360,30);
			textoremover.setText("Digite Produto que Deseja Remover");
			telainicial.add(textoremover);
			
			botaoinserir = new JButton();
			botaoinserir.setBounds(20,55, 360, 30);
			botaoinserir.addActionListener(objetolistener);
			botaoinserir.setText("Inserir Produto");
			telainicial.add(botaoinserir);
			
			botaototalvendas = new JButton();
			botaototalvendas.setBounds(20,90, 360, 30);
			botaototalvendas.addActionListener(objetolistener);
			botaototalvendas.setText("Mostrar Total de Vendas");
			telainicial.add(botaototalvendas);
			
			botaoremover = new JButton();
			botaoremover.setBounds(20,160, 360, 30);
			botaoremover.addActionListener(objetolistener);
			botaoremover.setText("Remover");
			telainicial.add(botaoremover);
			
			botaomaiscaro = new JButton();
			botaomaiscaro.setBounds(20,195, 360, 30);
			botaomaiscaro.addActionListener(objetolistener);
			botaomaiscaro.setText("Produto Mais Caro");
			telainicial.add(botaomaiscaro);
			
			botaolimpadisplay = new JButton();
			botaolimpadisplay.setBounds(20,615, 360, 30);
			botaolimpadisplay.addActionListener(objetolistener);
			botaolimpadisplay.setText("Limpar");
			telainicial.add(botaolimpadisplay);
			
			display = new JTextArea();
			display.setBounds(20, 235, 360, 370);
			telainicial.add(display);
		}
		
		
		
		public static void main(String[] args) {
			Controle tela = new Controle();
			tela.setBounds(20,20, 420, 700);
			tela.setVisible(true);
		}
		
		public class Manipulador implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botaoinserir){
					Produto novoproduto = new Produto();
					novoproduto.setNome(textoproduto.getText());
					novoproduto.setPreco(Double.parseDouble(textopreco.getText()));
					venda.inserirproduto(novoproduto);								
					textoproduto.setText("Digite o Nome do Produto");
					textopreco.setText("Digite o Preço do Produto");
				}
				if(event.getSource() == botaototalvendas){
					display.setText(venda.todosprodutos());
				}
				if(event.getSource() == botaoremover){
					venda.removerproduto(textoremover.getText());
				}
				if(event.getSource() == botaomaiscaro){
					Produto produtomaiscaro = new Produto();
					produtomaiscaro = venda.maisCaro();
					display.setText("Produto mais Caro:\nProduto: " +produtomaiscaro.getNome() +" Preço: R$ " + produtomaiscaro.getPreco());
				}
				if(event.getSource() == botaolimpadisplay){
					display.setText("");
				}
			}
		}
	}
