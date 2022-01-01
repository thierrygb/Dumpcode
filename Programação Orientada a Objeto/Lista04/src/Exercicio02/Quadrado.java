package Exercicio02;

public class Quadrado extends Figura{
	private double lado;
	
	public Quadrado(){
		super();
		lado = 0;
		}
	public double getLado(){
		return lado;
	}
	public void setLado(double lado){
		this.lado = lado;
	}
	public double area(){
		return lado*lado;
	}
}