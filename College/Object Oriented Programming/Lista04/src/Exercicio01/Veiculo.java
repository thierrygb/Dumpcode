package Exercicio01;

public class Veiculo {

	private String placa;
	private String cor;
	
	public Veiculo(){
		this.placa = "";
		this.cor = "";
		}
		public String getPlaca(){
		return placa;
		}
	public void setPlaca(String placa){
		this.placa = placa;
		}
	public String getCor(){
		return cor;
		}
	public void setCor(String cor) {
		this.cor = cor;
		}
	public static String todosDados(String placa, String cor){
		String dadosveiculo ="";
		dadosveiculo+="Placa: "+placa+"\nCor: " + cor;
		return dadosveiculo;
	}
}
