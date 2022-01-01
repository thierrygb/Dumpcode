package Lista01;

import javax.swing.JOptionPane;
public class Exercicio26 {
	public static void main(String args[]){
		String peso,altura;
		double kg,metros,IMC;
		peso=JOptionPane.showInputDialog("Digite o seu peso: ");
		altura=JOptionPane.showInputDialog("Digite a sua altura: ");
		kg=Double.parseDouble(peso);
		metros=Double.parseDouble(altura);
		IMC=kg/(metros*metros);
		if(IMC<18.5){
			JOptionPane.showMessageDialog(null, "Voce está abaixo do peso");
				
		}
		if(IMC>=18.6 && IMC<=25.9){
			JOptionPane.showMessageDialog(null, "Voce está saudavel");
		}
		if(IMC>=25 && IMC<=29.9){
			JOptionPane.showMessageDialog(null, "Voce está com peso em excesso");
		}
		if(IMC>=30 && IMC<=34.9){
			JOptionPane.showMessageDialog(null, "Voce está com obesidade grau 1");
		}
		if(IMC>=35 && IMC<=39.9){
			JOptionPane.showMessageDialog(null, "Voce está com obesidade grau 2");
		}
		if(IMC>=40){
			JOptionPane.showMessageDialog(null, "Voce está com obesidade morbida");
		}
		System.exit(0);
	}

}