package Exercicio14;

import javax.swing.*;
public class Exercicio14 {
	public static void main(String args[]){
		String e;
		int a,b=0;
		int vet[]=new int[10];
		for(int x=0;x<10;x++){
			e=JOptionPane.showInputDialog("Digite um número: ");
			vet[x]=Integer.parseInt(e);
		}
		for(int x=0;x<3;x++){
			e=JOptionPane.showInputDialog("Tente acerta um dos 10 número digitados anteriomente\nVocê terá 3 chances\n"+(x+1)+"° tentativa: ");
			a=Integer.parseInt(e);
			for(int y=0;y<10;y++){
				if(a==vet[y]){
					JOptionPane.showMessageDialog(null, "Parabéns, você acertou na sua "+(x+1)+"° tentativa");
					b++;
					break;
				}
			}
			if(b==1)break;
		}
		if(b==0)JOptionPane.showMessageDialog(null, "GAME OVER");
	}
}
