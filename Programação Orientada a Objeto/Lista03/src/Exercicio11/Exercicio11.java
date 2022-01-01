package Exercicio11;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio11 extends Applet {

	static List <aluno> listaaluno = new ArrayList <aluno>();
	
	public void init(){
		int numero;
		do{
			String entrada = JOptionPane.showInputDialog("MENU\n1 - Cadastrar o nome de um aluno que está entrando.\n2 - Listar todos os alunos que entraram.\n3 - Procurar por um aluno.\n4 - Sair.");
			numero = Integer.parseInt(entrada);
			
			if (numero==1) {
				inseriraluno();
			}
			else if (numero==2) {
				listaralunos();
			}
			else if (numero==3) {
				buscar();
			}
			else if (numero==4) {
			break;
			}
			else
				JOptionPane.showMessageDialog(null, "Opção inválida.");	
		}while((numero!=2&&numero!=1&&numero!=3&&numero!=4)||(numero==1||numero==2||numero==3));
	}
	private void buscar() {
		
	    String entrada;
		int numero;
		boolean busca=false;
		
	    entrada = JOptionPane.showInputDialog("Digite o nome do aluno:");
		for (aluno i:listaaluno){
			if (i.getNome().equals(entrada)){
	            JOptionPane.showMessageDialog(null, "Aluno presente");
					busca = true;
			}
		}
		if (busca == false){
			JOptionPane.showMessageDialog(null, "Aluno ausente");
		}	
	}	
	private void listaralunos() {
		String saida="";
		for (aluno i:listaaluno){
			saida += i.getNome() + ".\n";
		}
	JOptionPane.showMessageDialog(null, saida);		
	}
	private void inseriraluno() {
		aluno aluno = new aluno();
		String entrada;
		entrada = JOptionPane.showInputDialog("Digite o nome do aluno:"); 
		aluno.setNome(entrada);
		listaaluno.add(aluno);	
		}
	}
class aluno{
	String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
