package Exercicio01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class main extends JFrame{

		
		JButton botaocadastrarcarro,botaocadastrarmoto,botaocadastrarcaminhao,botaoimprimir;
		JLabel labelcarros, labelmotos,labelcaminhoes, labelveiculos;
		JTextField textoplacacarro, textocorcarro, textochassicarro;
		JTextField textoplacamoto, textocormoto, textocilindradasmoto;
		JTextField textoplacacaminhao, textocorcaminhao, textocargacaminhao, textonumerodeeixoscaminhao;
		JTextArea display;
		String imprimirveiculos="";
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		
		public main(){
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			
			Manipuladorex04 objetolistener = new Manipuladorex04();
			labelcarros = new JLabel();
			labelcarros.setText("Carro:");
			labelcarros.setBounds(20, 20, 170, 30);
			telainicial.add(labelcarros);
			textoplacacarro = new JTextField();
			textoplacacarro.setText("Placa");
			textoplacacarro.setBounds(20,60,170,30);
			telainicial.add(textoplacacarro);
			textocorcarro = new JTextField();
			textocorcarro.setText("Cor");
			textocorcarro.setBounds(20,100,170,30);
			telainicial.add(textocorcarro);
			textochassicarro = new JTextField();
			textochassicarro.setText("Chassi");
			textochassicarro.setBounds(20,140,170,30);
			telainicial.add(textochassicarro);
			botaocadastrarcarro = new JButton();
			botaocadastrarcarro.setText("Cadastrar Carro");
			botaocadastrarcarro.setBounds(20,180,170,30);
			botaocadastrarcarro.addActionListener(objetolistener);		
			telainicial.add(botaocadastrarcarro);
			//======================================================
			
			labelmotos = new JLabel();
			labelmotos.setText("Moto:");
			labelmotos.setBounds(20, 220, 170, 30);
			telainicial.add(labelmotos);
			textoplacamoto = new JTextField();
			textoplacamoto.setText("Placa");
			textoplacamoto.setBounds(20,260,170,30);
			telainicial.add(textoplacamoto);
			textocormoto = new JTextField();
			textocormoto.setText("Cor");
			textocormoto.setBounds(20,300,170,30);
			telainicial.add(textocormoto);
			textocilindradasmoto = new JTextField();
			textocilindradasmoto.setText("Cilindradas");
			textocilindradasmoto.setBounds(20,340,170,30);
			telainicial.add(textocilindradasmoto);
			botaocadastrarmoto = new JButton();
			botaocadastrarmoto.setText("Cadastrar Moto");
			botaocadastrarmoto.setBounds(20,380,170,30);
			botaocadastrarmoto.addActionListener(objetolistener);		
			telainicial.add(botaocadastrarmoto);
			//======================================================
			
			labelcaminhoes = new JLabel();
			labelcaminhoes.setText("Caminhão:");
			labelcaminhoes.setBounds(20, 420, 170, 30);
			telainicial.add(labelcaminhoes);
			textoplacacaminhao = new JTextField();
			textoplacacaminhao.setText("Placa");
			textoplacacaminhao.setBounds(20,460,170,30);
			telainicial.add(textoplacacaminhao);
			textocorcaminhao = new JTextField();
			textocorcaminhao.setText("Cor");
			textocorcaminhao.setBounds(20,500,170,30);
			telainicial.add(textocorcaminhao);
			textonumerodeeixoscaminhao = new JTextField();
			textonumerodeeixoscaminhao.setText("Número de Eixos");
			textonumerodeeixoscaminhao.setBounds(20,540,170,30);
			telainicial.add(textonumerodeeixoscaminhao);
			textocargacaminhao = new JTextField();
			textocargacaminhao.setText("Carga");
			textocargacaminhao.setBounds(20,580,170,30);
			telainicial.add(textocargacaminhao);
			botaocadastrarcaminhao = new JButton();
			botaocadastrarcaminhao.setText("Cadastrar Caminhão");
			botaocadastrarcaminhao.setBounds(20,620,170,30);
			botaocadastrarcaminhao.addActionListener(objetolistener);		
			telainicial.add(botaocadastrarcaminhao);
			//======================================================
			
			display = new JTextArea();
			display.setText("");
			display.setBounds(200, 100, 470, 550);
			telainicial.add(display);
			botaoimprimir = new JButton();
			botaoimprimir.setText("Imprimir Veículos");
			botaoimprimir.setBounds(200,60,470,30);
			botaoimprimir.addActionListener(objetolistener);		
			telainicial.add(botaoimprimir);
			labelveiculos = new JLabel();
			labelveiculos.setText("Veículos:");
			labelveiculos.setBounds(250, 0, 300, 30);
			labelveiculos.setFont(new Font("Serif", Font.BOLD, 30));
			telainicial.add(labelveiculos);}
		
		public static void main(String[] args) {
			main tela = new main();
			tela.setVisible(true);
			tela.setBounds(0, 0, 700, 700);		
		}
		
		public class Manipuladorex04 implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botaocadastrarcarro){				
					Carro carro = new Carro();
					carro.setCor(textocorcarro.getText());
					carro.setPlaca(textoplacacarro.getText());
					long chassilong = Long.parseLong(textochassicarro.getText());
					carro.setChassi(chassilong);
					veiculos.add(carro);
					imprimirveiculos+="Carro:\n\n"+carro.todosDados(textoplacacarro.getText(), textocorcarro.getText()) + carro.todosDados(chassilong)+"\n\n";
					textoplacacarro.setText("Placa");
					textocorcarro.setText("Cor");
					textochassicarro.setText("Chassi");
				}
				if (event.getSource() == botaocadastrarmoto){				
					Moto moto = new Moto();
					moto.setCor(textocormoto.getText());
					moto.setPlaca(textoplacamoto.getText());
					int cilindradasint = Integer.parseInt(textocilindradasmoto.getText());
					moto.setCilindradas(cilindradasint);
					veiculos.add(moto);
					imprimirveiculos+="Moto:\n\n"+moto.todosDados(textoplacamoto.getText(), textocormoto.getText()) + moto.todosDados(cilindradasint)+"\n\n";
					textoplacamoto.setText("Placa");
					textocormoto.setText("Cor");
					textocilindradasmoto.setText("Cilindradas");}
				if (event.getSource() == botaocadastrarcaminhao){				
					Caminhao caminhao = new Caminhao();
					caminhao.setCor(textocorcaminhao.getText());
					caminhao.setPlaca(textoplacacaminhao.getText());
					double cargadouble = Double.parseDouble(textocargacaminhao.getText());
					int numerodeeixosint = Integer.parseInt(textonumerodeeixoscaminhao.getText());
					caminhao.setCarga(cargadouble);
					caminhao.setNum_eixos(numerodeeixosint);
					veiculos.add(caminhao);
					imprimirveiculos+="Caminhão:\n\n"+caminhao.todosDados(textoplacacaminhao.getText(), textocorcaminhao.getText()) + caminhao.todosDados(numerodeeixosint, cargadouble)+"\n\n";
					textoplacacaminhao.setText("Placa");
					textocargacaminhao.setText("Carga");
					textocorcaminhao.setText("Cor");
					textonumerodeeixoscaminhao.setText("Número de Eixos");}
				if (event.getSource() == botaoimprimir){				
					display.setText(imprimirveiculos);
					
				}
			}
		}
	}