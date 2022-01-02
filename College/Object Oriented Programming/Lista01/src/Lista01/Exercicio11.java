package Lista01;

import javax.swing.*;
public class Exercicio11 {
	public static void main(String args[]){
		String entrada;
		float v[]= new float[10],aux,media=0;
		for(int i=0; i<10; i++){
			entrada=JOptionPane.showInputDialog("Digite o "+(i+1)+" numero:");
			v[i]=Float.parseFloat(entrada);
		}
		for(int i=0;i<10;i++){
			JOptionPane.showMessageDialog(null, v[i]);
		}
		for(int i=0;i<9;i++){
			for(int j=i+1;j<10;j++){
				if(v[i]>v[j]){
					aux=v[i];
					v[i]=v[j];
					v[j]=aux;
				}
			}
		}
		for(int i=0;i<10;i++){
			media=media+v[i];
		}
		media=media/10;
		JOptionPane.showMessageDialog(null, "Maior valor:"+v[9]+"\nMenor valor:"+v[0]+"\nMedia:"+media);
	}

}