package Lista01;

import javax.swing.*;
public class Exercicio21 extends JApplet {
	public void init(){
		String entradadovetor,num;
		int v[]= new int[15],num2,aux;
		for(int i=0;i<15;i++){
		entradadovetor=JOptionPane.showInputDialog("Digite o "+(i+1)+" numero:");
		v[i]=Integer.parseInt(entradadovetor);
	}
		num=JOptionPane.showInputDialog("Digite o numero a multiplicar o vetor:");
		num2=Integer.parseInt(num);
		for(int i=0;i<15;i++){
			v[i]= v[i]*num2;
	        }
		for(int i=0;i<14;i++){
			for(int j=i+1;j<15;j++){
				if(v[i]>v[j]){
					aux=v[i];
					v[i]=v[j];
					v[j]=aux;
					
				}
			}
			JOptionPane.showMessageDialog(null, v[i]);
		}
		
	}
}