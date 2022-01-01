package Exercicio04;

public class Professor extends Empregado {
	
	private double valorhora;
	private int numhoras;
	
	public Professor(String nome, double encargos, double valorhora, int numhoras){
		super(nome, encargos);
		this.valorhora = valorhora;
		this.numhoras = numhoras;
	}
	
	public double getValorhora(){
		return valorhora;
	}
	public void setValorhora(double valorhora){
		this.valorhora = valorhora;
	}
	public int getNumhoras(){
		return numhoras;
	}
	public void setNumhoras(int numhoras){
		this.numhoras = numhoras;
	}
	public double salarioLiquido(){
		return numhoras*valorhora;
	}
}
