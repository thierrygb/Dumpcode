package Exercicio02;

import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class main extends JApplet{
	public void init() {
		
		ArrayList <Figura> figuraLista = new ArrayList <Figura>();
		String opcao="";
		int menu = 0;
		
		while(menu < 5){
			
			opcao = JOptionPane.showInputDialog("Cadastro de figuras:\n 1-Cadastrar Quadrados\n 2-Cadastrar Círculo\n 3-Cadastrar triângulos\n 4-Exibir dados da figura com maior área\n 5-Exit");
			menu = Integer.parseInt(opcao);
			
			switch(menu){
			case 1:
				figuraLista.add(cadastrarQuadrados());
				break;
			case 2:
				figuraLista.add(cadastrarCirculos());
				break;
			case 3:
				figuraLista.add(cadastrarTriangulos());
				break;
			case 4:
				double compara=0;
				for (int i = 0; i < figuraLista.size(); i++){
					if(compara<=figuraLista.get(i).area()){
						compara = figuraLista.get(i).area();
					}
				}
				for (int i = 0; i < figuraLista.size(); i++){
					if(compara==figuraLista.get(i).area()){
						JOptionPane.showMessageDialog(null, figuraLista.get(i).getCor() + figuraLista.get(i).area());
					}
				}
			}
		}
	}
	
	public Quadrado cadastrarQuadrados(){
		Quadrado quadrado = new Quadrado();
		String entradaCor=JOptionPane.showInputDialog("Digite a cor do quadrado");
		quadrado.setCor(entradaCor);
		String entradaLado=JOptionPane.showInputDialog("Digite o comprimento do lado do quadrado");
		int lado = Integer.parseInt(entradaLado);
		quadrado.setLado(lado);
		JOptionPane.showMessageDialog(null,quadrado.area());
		return quadrado;}
	public Circulo cadastrarCirculos(){
		Circulo circulo = new Circulo();
		String entradaCor=JOptionPane.showInputDialog("Digite a cor do círculo");
		circulo.setCor(entradaCor);
		String entradaRaio=JOptionPane.showInputDialog("Digite o comprimento do raio");
		double raio = Double.parseDouble(entradaRaio);
		circulo.setRaio(raio);
		JOptionPane.showMessageDialog(null, circulo.area());
		return circulo;}
	public Triangulo cadastrarTriangulos(){
		Triangulo triangulo = new Triangulo();
		String entradaCor = JOptionPane.showInputDialog("Digite a cor do triângulo");
		triangulo.setCor(entradaCor);
		String entradaBase = JOptionPane.showInputDialog("Digite o comprimento da base");
		double base = Double.parseDouble(entradaBase);
		triangulo.setBase(base);
		String entradaAltura = JOptionPane.showInputDialog("Digite o comprimento da altura");
		double altura = Double.parseDouble(entradaAltura);
		triangulo.setAltura(altura);
		JOptionPane.showMessageDialog(null, triangulo.area());
		return triangulo;
	}
		
}		
		