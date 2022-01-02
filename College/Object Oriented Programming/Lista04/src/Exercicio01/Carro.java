package Exercicio01;

public class Carro extends Veiculo {

	private long chassi;
	
	public Carro(){
		super();
		this.chassi = 0;
		}
	public long getChassi(){
		return chassi;
		}
	public void setChassi(long chassi){
		this.chassi = chassi;
		}
	public static String todosDados(long chassi){
		String dadoscarro ="";
		dadoscarro+="\nChassi: "+chassi;
		return dadoscarro;	
		}
}