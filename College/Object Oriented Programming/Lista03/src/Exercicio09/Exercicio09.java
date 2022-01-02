package Exercicio09;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Exercicio09 extends JApplet{
	public void init(){
		Veiculos [] veiculos = new Veiculos[2];
		for (int i = 0; i < veiculos.length; i++){
			String nomeVeiculo = JOptionPane.showInputDialog("Digite o nome do veículo " + (i+1) + ".");
			String anoFabricacao = JOptionPane.showInputDialog("Digite o ano do veículo " + (i+1) + ".");
			veiculos[i] = new Veiculos(anoFabricacao, nomeVeiculo);
		}
		String saida = "";
		for (int i = 0; i < veiculos.length; i++){
			saida = saida + "-- Veículo " + (i+1) + " --\nNome: " + veiculos[i].getNomeveiculo() +
					"\nAno de fabricação: " + veiculos[i].getAnodefabricacao() + "\n\n";
		}
		JOptionPane.showMessageDialog (null, saida);
	}
}
class Veiculos{	
	private String anodefabricacao;
	private String nomeveiculo;
	Veiculos(String anopassado, String nomepassado){
		setAnodefabricacao(anopassado);
		setNomeveiculo(nomepassado);
	}
	public String getAnodefabricacao() {
		return anodefabricacao;
	}
	public void setAnodefabricacao(String anodefabricacao) {
		this.anodefabricacao = anodefabricacao;
	}
	public String getNomeveiculo() {
		return nomeveiculo;
	}
	public void setNomeveiculo(String nomeveiculo) {
		this.nomeveiculo = nomeveiculo;
	}
}