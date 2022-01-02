package Exercicio05;

import javax.swing.*;
public class Exercicio05 {
	public static void main(String args[]){
		String usuario;
		int v[]= {2,7,5}; 
		int v2[]=new int [15],cont=0;
		for(int i=0;i<15;i++){
			usuario=JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero:");
			v2[i]=Integer.parseInt(usuario);
		}
		for(int i=0;i<15;i++){
			if(v2[i]==v[0]){
				JOptionPane.showMessageDialog(null,"Número encontrados a partir da posição "+v2[i]);
				cont++;
			}
			if(v2[i]==v[1]){
				JOptionPane.showMessageDialog(null,"Número encontrados a partir da posição "+v2[i]);
				cont++;
			}
			if(v2[i]==v[2]){
				JOptionPane.showMessageDialog(null,"Número encontrados a partir da posição "+v2[i]);
				cont++;
			}
			if(cont==0){
				JOptionPane.showMessageDialog(null,"Números nao encontrados ");			
			}
		}
	}
}

			
	