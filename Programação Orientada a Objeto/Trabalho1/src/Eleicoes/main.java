package Eleicoes;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class main extends Applet{
	/**
	 * Trabalho de Programação Orientada a Objeto - 2018/2
	 * Nome: Thierry Gonçalves Braga	MAT:154300066
	 * Trabalho Prático I - Sistema de votação
	 */
	private static final long serialVersionUID = 1L;
	static List <prefeito> listaprefeito = new ArrayList <prefeito>();
	static List <vereador> listavereador = new ArrayList <vereador>();
	static String soma="";
	
	public void init(){
		String prefeitomaisvotado, vereadormaisvotado;
		int numero;
		
		JOptionPane.showMessageDialog(null, "Cadastro | Prefeito");
		for (int i = 0; i < 3; i++){
			candidatosPrefeito();}
		
		JOptionPane.showMessageDialog(null, "Cadastro | Vereador");
		for (int i = 0; i < 3; i++) {
			candidatosVereador();}
		
		JOptionPane.showMessageDialog(null, "Eleição");
		do{
			String entrada = JOptionPane.showInputDialog("1 - Votar em Prefeito.\n2 - Votar em Vereador.\n3 - Sair e Mostrar Resultado");
			numero = Integer.parseInt(entrada);
		
			if (numero==1){
				VotarPrefeito();
			}
			else if (numero==2){
				VotarVereador();
			}
			else if (numero==3){
				prefeitomaisvotado = prefeitoMaisVotado();
				vereadormaisvotado = vereadorMaisVotado();
			if(prefeitomaisvotado==""&&vereadormaisvotado!=""){
				JOptionPane.showMessageDialog(null, "Nenhum Prefeito foi votado.\nO vereador mais votado foi " + vereadormaisvotado + ".");
			}
			else if (prefeitomaisvotado!=""&&vereadormaisvotado==""){
				JOptionPane.showMessageDialog(null, "Nenhum vereador foi votado.\nO prefeito mais votado foi " + prefeitomaisvotado + ".");
			}
			else if (prefeitomaisvotado==""&&vereadormaisvotado==""){
				JOptionPane.showMessageDialog(null, "Nenhum canditado foi votado.");
			}
			else 
				JOptionPane.showMessageDialog(null, "O prefeito mais votado foi " + prefeitomaisvotado + ".\n\nO vereador mais votado foi " + vereadormaisvotado + ".");	
			}
			else{
				JOptionPane.showMessageDialog(null, "Opção inválida.");	
			}
		}while((numero!=2&&numero!=1&&numero!=3)||(numero==1||numero==2));
	}
	
	private static String vereadorMaisVotado() {
		String maisvotado="";
		int numero = 0;
		for (vereador i:listavereador){
			if (i.getNumVotos()>numero){
				numero = i.getNumVotos();
				maisvotado = i.getNome();
			}
		}
		if(numero == 0){
			maisvotado = "";}
		else{
			maisvotado += " com " + numero + " votos";}
		return maisvotado;}

	private static String prefeitoMaisVotado(){
		String maisvotado="";
		int numero = 0;
		for (prefeito i:listaprefeito){		
			if (i.getNumVotos()>numero){
				numero = i.getNumVotos();
				maisvotado = i.getNome();
			}
		}
		if(numero == 0){
			maisvotado = "";}
		else{
			maisvotado += " com " + numero + " votos";}
		return maisvotado;
	}
	
	private static void VotarVereador(){
		soma = "Vote no Vereador: \n";
		int numero=0;
		boolean voto = false;
		for (vereador i:listavereador){
			soma += i.getNumero() + " - " + i.getNome() + " - " + i.getPartido() + "\n";
		}
		String entrada = JOptionPane.showInputDialog(soma);
			try{
				numero = Integer.parseInt(entrada);			
			}catch (NumberFormatException e){
				voto = false;}
			
			for (vereador i:listavereador){
				if (i.getNumero()==numero){
					i.incrementaVoto();
					voto = true;
				}
			}
			if (voto == false){
				JOptionPane.showMessageDialog(null, "Digito Inválido, voto não computado!");}
			else if (voto == true){
				JOptionPane.showMessageDialog(null, "Voto computado com sucesso!");
			}
		}

	private static void VotarPrefeito(){
		soma = "Vote no Prefeito: \n";
		int numero=0;
		boolean voto = false;
		for (prefeito i:listaprefeito){
			soma += i.getNumero() + " - " + i.getNome() + " - " + i.getPartido() + "\n";}
			String entrada = JOptionPane.showInputDialog(soma);
			try{
				numero = Integer.parseInt(entrada);			
			}catch (NumberFormatException e){
				voto = false;}
			
			for (prefeito i:listaprefeito){
				if (i.getNumero()==numero){
					i.incrementaVoto();
					voto = true;
				}
			}
			if (voto == false){
				JOptionPane.showMessageDialog(null, "Digito Inválido, voto não computado!");}
			else if (voto == true){
				JOptionPane.showMessageDialog(null, "Voto computado com sucesso!");}
			}
	
	private static void candidatosVereador(){
		vereador vereador = new vereador();
		String entrada;
		boolean repete = false;
		int numero=0;
		entrada = JOptionPane.showInputDialog("Digite o nome do candidato a vereador:"); 
		vereador.setNome(entrada);
		entrada = JOptionPane.showInputDialog("Digite o nome do partido do candidato a vereador:");
		vereador.setPartido(entrada);
		do{
			entrada = JOptionPane.showInputDialog("Digite o numero do candidato a vereador:");
			try{
				numero = Integer.parseInt(entrada);
				repete = false;
			}catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "DIGITE UM NÚMERO!");
				repete = true;}
				
		}while(repete==true);
			
		vereador.setNumero(numero);
			listavereador.add(vereador);	
	}

	private static void candidatosPrefeito(){
		prefeito prefeito = new prefeito();
		String entrada;
		boolean repete = false;
		int numero=0;
		entrada = JOptionPane.showInputDialog("Digite o nome do candidato a prefeito:"); 
		prefeito.setNome(entrada);
		entrada = JOptionPane.showInputDialog("Digite o nome do partido do candidato a prefeito:");
		prefeito.setPartido(entrada);
		do{
			entrada = JOptionPane.showInputDialog("Digite o numero do candidato a prefeito:");
			try{
				numero = Integer.parseInt(entrada);
				repete = false;
			}catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "DIGITE UM NÚMERO!");
				repete = true;}
		}while(repete==true);
		prefeito.setNumero(numero);
		listaprefeito.add(prefeito);
	}
}