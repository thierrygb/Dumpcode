package Exercicio01;

public class Moto extends Veiculo {
	
	private int cilindradas;
	public Moto(){
		super();
		this.cilindradas = 0;
		}
	public int getCilindradas(){
		return cilindradas;
		}
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
		}
	public String todosDados(int cilindradas){
		String dadosmoto ="";
		dadosmoto +="\nCilindradas: "+cilindradas;
		return dadosmoto;
		}
}