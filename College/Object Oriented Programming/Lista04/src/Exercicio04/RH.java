package Exercicio04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class RH extends JFrame {

		
		JButton botaocadastraprofessor, botaocadastrafuncionario, botaoimprime, botaocompara;
		JTextField textonomeprofessor, textoencargosprofessor, textovalorhoraprofessor, textonumerodehorasprofessor;
		JTextField textonomefuncionario, textoencargosfuncionario, textosalariofuncionario;
		JTextField textosalarioparacomparar;
		JLabel labelprofessor, labelfuncionario;
		JTextArea display;
		List<Empregado> empregado = new ArrayList<Empregado>();
		
		public RH() {
			Container telainicial = getContentPane();
			telainicial.setLayout(null);
			Manipulador objetolistener = new Manipulador();
			
			labelprofessor = new JLabel();
			labelprofessor.setBounds(20, 20, 100, 30);
			labelprofessor.setText("Professor:");
			telainicial.add(labelprofessor);
			textonomeprofessor = new JTextField();
			textonomeprofessor.setBounds(20,60,170,30);
			textonomeprofessor.setText("Nome");
			telainicial.add(textonomeprofessor);
			textoencargosprofessor = new JTextField();
			textoencargosprofessor.setBounds(20,100,170,30);
			textoencargosprofessor.setText("Encargos");
			telainicial.add(textoencargosprofessor);
			textovalorhoraprofessor = new JTextField();
			textovalorhoraprofessor.setBounds(20,140,170,30);
			textovalorhoraprofessor.setText("Valor Hora");
			telainicial.add(textovalorhoraprofessor);
			textonumerodehorasprofessor = new JTextField();
			textonumerodehorasprofessor.setBounds(20,180,170,30);
			textonumerodehorasprofessor.setText("Horas Trabalhadas");
			telainicial.add(textonumerodehorasprofessor);
			botaocadastraprofessor = new JButton();
			botaocadastraprofessor.setBounds(20,220,170,30);
			botaocadastraprofessor.addActionListener(objetolistener);
			botaocadastraprofessor.setText("Cadastrar Professor");
			telainicial.add(botaocadastraprofessor);
			labelfuncionario = new JLabel();
			labelfuncionario.setBounds(220, 20, 100, 30);
			labelfuncionario.setText("Funcionário:");
			telainicial.add(labelfuncionario);
			textonomefuncionario = new JTextField();
			textonomefuncionario.setBounds(220,60,170,30);
			textonomefuncionario.setText("Nome");
			telainicial.add(textonomefuncionario);
			textoencargosfuncionario = new JTextField();
			textoencargosfuncionario.setBounds(220,100,170,30);
			textoencargosfuncionario.setText("Encargos");
			telainicial.add(textoencargosfuncionario);
			textosalariofuncionario = new JTextField();
			textosalariofuncionario.setBounds(220,140,170,30);
			textosalariofuncionario.setText("Salário");
			telainicial.add(textosalariofuncionario);
			botaocadastrafuncionario = new JButton();
			botaocadastrafuncionario.setBounds(220,220,170,30);
			botaocadastrafuncionario.addActionListener(objetolistener);
			botaocadastrafuncionario.setText("Cadastrar Funcionário");
			telainicial.add(botaocadastrafuncionario);
			botaoimprime = new JButton();
			botaoimprime.setBounds(20,260,370,30);
			botaoimprime.addActionListener(objetolistener);
			botaoimprime.setText("Imprime Empregados");
			telainicial.add(botaoimprime);
			display = new JTextArea();
			display.setBounds(20,300,370,300);
			display.setText("");
			telainicial.add(display);
			textosalarioparacomparar = new JTextField();
			textosalarioparacomparar.setBounds(20,620,170,30);
			textosalarioparacomparar.setText("Salário para Comparar");
			telainicial.add(textosalarioparacomparar);
			botaocompara = new JButton();
			botaocompara.setBounds(220,620,170,30);
			botaocompara.addActionListener(objetolistener);
			botaocompara.setText("Compara Salários");
			telainicial.add(botaocompara);
		}
		
		public static void main(String[] args) {
			RH tela = new RH();
			tela.setBounds(20,20, 420, 700);
			tela.setVisible(true);
		}
		
		public class Manipulador implements ActionListener{
			public void actionPerformed (ActionEvent event){
				if (event.getSource() == botaocadastrafuncionario){
					cadastraFunc();				}			
				if (event.getSource() == botaocadastraprofessor){
					cadastraProf();	}
				if (event.getSource() == botaoimprime){
					imprimeTodosEmpregados();}
				if (event.getSource() == botaocompara){
					maiorSalario();	}}}
		public boolean cadastraFunc(){
			String nome = textonomefuncionario.getText();
			double encargos = Double.parseDouble(textoencargosfuncionario.getText());
			double salario = Double.parseDouble(textosalariofuncionario.getText());
			Funcionario funcionario = new Funcionario(nome,encargos,salario);
			empregado.add(funcionario);
			if(funcionario!=null){
				return true;
			}else{
				return false;
			}
		}
		
		public boolean cadastraProf(){
			String nome = textonomeprofessor.getText();
			double encargos = Double.parseDouble(textoencargosprofessor.getText());
			int numerodehoras = Integer.parseInt(textonumerodehorasprofessor.getText());
			double valorhora = Double.parseDouble(textovalorhoraprofessor.getText());
			Professor professor = new Professor(nome, encargos, valorhora, numerodehoras);
			empregado.add(professor);
			if(professor!=null){
				return true;
			}else{
				return false;
			}
		}
		
		public void maiorSalario(){
			double salariomaior = Double.parseDouble(textosalarioparacomparar.getText());
			String imprimir = "Empregados que ganham mais que R$ " + salariomaior + "\n";
			for (Empregado empregados : empregado) {
				if(empregados.salarioLiquido()>=salariomaior){
					imprimir += "Nome: "+empregados.getNome() +"\nSalario: R$" +empregados.salarioLiquido() +"\n\n";
				} 
			}
			if (imprimir.equals("")){
				display.setText("Nenhum Empregado ganha mais que R$ " + salariomaior);
			}else{
				display.setText(imprimir);
			}
			
		}
		public void imprimeTodosEmpregados(){
			String imprimirtodos="";
			for (Empregado empregados : empregado) {
					imprimirtodos += "Nome: "+empregados.getNome() +"\nSalario: R$" +empregados.salarioLiquido() +"\n\n"; 
			}
			display.setText(imprimirtodos);
		}
		
			
	}
