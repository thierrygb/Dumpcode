package Exercicio02;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Triangulo(){
		super();
		base = 0;
		altura = 0;
	}
	public double getBase(){
		return base;
	}
	public void setBase(double base){
		this.base = base;
	}
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double area(){
		return base*altura;
	}
}