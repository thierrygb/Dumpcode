package Exercicio15;

import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class Exercicio15 extends JApplet{
	public void init(){
		String entrada1,entrada2;
		int cont=0;
		double v[]=new double [10],v1[]=new double [10];
		for(int i=0;i<10;i++){
	    	   entrada1=JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero do vetor 1:");
	    	   v[i]=Integer.parseInt(entrada1);
		}
		for(int i=0;i<10;i++){
	    	   entrada2=JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero do vetor 2:");
	    	   v1[i]=Integer.parseInt(entrada2);
		}
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(v[i]==v1[j]){
					cont++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Os vetores possuem "+cont+" valores iguais");
	}
}
	