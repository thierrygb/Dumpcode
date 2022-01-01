package Exercicio12;

import javax.swing.*;
public class Exercicio12 {
	public static int jogardado (){
		
		int x=0;
		x = 1 + (int)(Math.random() * 5);
		return x;
	}
	public static void main (String[] args){
		
		String y ;
		int v[]={0,0,0,0,0,0};
		int a ;
		
		y=JOptionPane.showInputDialog("Informe o numero de vazes que deseja jogar o dado: ");
		a=Integer.parseInt(y);
		
		for(int i=0;i<a;i++){
			int b=0;
			b=jogardado();
			v[b] = v[b]+1;
		}
		JOptionPane.showMessageDialog(null, "A frequencia de saida do dado foi: \nNº1-" +v[0]+"\nNº2-"+v[1]+"\nNº3="+v[2]+"\nNº4-"+v[3]+"\nNº5-"+v[4]+"\nNº6-"+v[5]);
	}
}