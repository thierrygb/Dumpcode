package Exercicio04;

public abstract class Empregado{
	
	private String nome;
	private double encargos;
	
	public Empregado(String nome, double encargos){
		this.nome = nome;
		this.encargos = encargos;
	}
	public abstract double salarioLiquido();
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getEncargos(){
		return encargos;
	}
	public void setEncargos(double encargos){
		this.encargos = encargos;
	}
}