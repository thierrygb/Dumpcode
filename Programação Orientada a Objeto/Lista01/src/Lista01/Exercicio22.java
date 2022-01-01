package Lista01;

import javax.swing.JOptionPane;

public class Exercicio22 {
	public static void main(String[] args) {
		int vetor[] = new int [6];
		String saida = "";
		for (int j = 0; j < 6; j++){
				vetor[j] = gerarnumeromegasena();
				for (int i = 0; i < j; i++){
					if( i != j){
					if(vetor[j] == vetor [i]){
						j--;
						break;
					}
				}
				}
				
			}
		for (int a = 0; a < 6; a++){
				saida += vetor[a] + " ";
		}
		JOptionPane.showMessageDialog(null, "Jogue na mega sena com os números: \n" + saida);
	}
	private static int gerarnumeromegasena() {
		return 1 +(int)(Math.random()* 60);
		}
		
	}