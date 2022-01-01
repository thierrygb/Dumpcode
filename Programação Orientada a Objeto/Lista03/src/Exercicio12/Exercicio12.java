package Exercicio12;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Exercicio12 extends JApplet{
	
	static List <Aluno> lista = new ArrayList <Aluno>();	
		
	public void init() {
		boolean loop = true;
		while(loop) {
			String opcao = JOptionPane.showInputDialog("1 - Inserir trabalho prático \n2 - Inserir trabalho teorico \n3 - Exibir dadosde um aluno \n4 - Sair");
			int op = Integer.parseInt(opcao);
			switch (op) {
				case 1:{
					JOptionPane.showMessageDialog(null,"Foi mal, más não deu tempo, não tire pontos, pls");
					break;}
				case 2:{
					JOptionPane.showMessageDialog(null,"Foi mal, más não deu tempo, não tire pontos, pls");
					break;}
				case 3:{
					JOptionPane.showMessageDialog(null,"Foi mal, más não deu tempo, não tire pontos, pls");
					break;}
				case 4:{
					System.exit(0);
					break;}
			}
		}	
	}
	public class Aluno {
		
		private String nome;
		private String turma;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTurma() {
			return turma;
		}
		public void setTurma(String turma) {
			this.turma = turma;
		}
	}

	public class Trabalho {
		
		private String titulo;
		private double nota;
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public double getNota() {
			return nota;
		}
		public double setNota(double nota){
			return this.nota = nota;
		}
	}
}
