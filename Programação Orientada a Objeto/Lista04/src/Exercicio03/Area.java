package Exercicio03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Area extends JApplet{
	JButton botaocalcular;
	JTextField textoaltura, textolargura;
	int largura1, altura1;
	Retangulo retangulo;
	
	public void init() {
		Container tela = getContentPane();
		tela.setLayout(null);
		Manipuladorex02 objetolistener = new Manipuladorex02();
		botaocalcular = new JButton();
		botaocalcular.setText("Calcular");
		botaocalcular.setBounds(55,125,85,30);
		botaocalcular.addActionListener(objetolistener);
		tela.add(botaocalcular);
		textoaltura = new JTextField(20);
		textoaltura.setText("Digite a Altura");
		textoaltura.setBounds(50,35,100,30);
		tela.add(textoaltura);
		textolargura = new JTextField(20);
		textolargura.setText("Digite a Largura");
		textolargura.setBounds(50,85,100,30);
		tela.add(textolargura);
				
		setBounds(20,20, 100,80);
		setVisible(true);}

	public class Manipuladorex02 implements ActionListener{
		public void actionPerformed (ActionEvent event){
			if (event.getSource() == botaocalcular)
				try {	altura1 = Integer.parseInt(textoaltura.getText());
						largura1 = Integer.parseInt(textolargura.getText());
						retangulo = new Retangulo(altura1, largura1);
						JOptionPane.showMessageDialog(null, "Área do Retângulo = " + retangulo.area());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Use Apenas Números!!!");}	}}}

class Retangulo{
	private int altura;
	private int largura;
	int area(){return (getAltura()*getLargura());}
	Retangulo(int alturapassada, int largurapassada){
		setAltura(alturapassada);
		setLargura(largurapassada);
		area();}
	public int getAltura() {
		return altura;}
	public void setAltura(int altura) {
		this.altura = altura;}
	public int getLargura() {
		return largura;}
	public void setLargura(int largura) {
		this.largura = largura;}}