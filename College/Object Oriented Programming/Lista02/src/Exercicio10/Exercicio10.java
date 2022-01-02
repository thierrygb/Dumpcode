package Exercicio10;

import javax.swing.*;
public class Exercicio10 extends JApplet{
	public void init(){
		
		String entrada;
		int cont1 = 0,cont2 = 0;
		double v[] = new double[60], aux, porcent, rep;
		
		for(int i=0;i<60;i++){
			entrada = JOptionPane.showInputDialog("Informe a nota do aluno : ");
			v[i]=Double.parseDouble(entrada);
			cont1++;
		}
		for(int i=0;i<cont1-1;i++){
			for(int j=i+1;j<cont1;j++){
				if(v[i] > v[j]){
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		for(int i=0;i<cont1;i++){
			if(v[i]>=60) cont2++;
		}
		
		porcent = 100*cont2/cont1;
		rep = 100-porcent;
		
		JOptionPane.showMessageDialog(null,porcent+"% dos alunos foram aprovados\n"+rep+"% dos alunos foram reprovados\n"+v[cont1-1]+" é a maior nota\n"+v[0]+" é a pior nota");
	}
}