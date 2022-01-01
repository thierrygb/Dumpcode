package Lista01;

import javax.swing.*;
public class Exercicio18 {
	public static void main(String args[]){
       String entradausuario,segundo;
       int v[]=new int [10],num,seg,cont=0;
       for(int i=0;i<10;i++){
    	   entradausuario=JOptionPane.showInputDialog("Digite o "+(i+1)+"º numero:");
    	   v[i]=Integer.parseInt(entradausuario);
       }
       for(int i=0;i<5;i++){
       segundo=JOptionPane.showInputDialog("Tente advinhar um numero:");
       seg=Integer.parseInt(segundo);
           for(int j=0;j<10;j++){
    	       if(seg==v[j]){
            		JOptionPane.showMessageDialog(null, "Voce advinhou o numero "+seg);
            		cont++;
            		
            	}
            }
        if(cont!=0){
        	break;
        }
        if(cont==0){
        	JOptionPane.showMessageDialog(null, "Voce nao advinhou o numero ");
        }
	}
}
}