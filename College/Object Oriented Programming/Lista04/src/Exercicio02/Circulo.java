package Exercicio02;

public class Circulo extends Figura{
	private double raio;
		public Circulo(){
		super();
		raio = 0;
		}
		public double getRaio(){
		return raio;
		}
		public void setRaio(double raio){
		this.raio = raio;
		}
		public double area(){
		return Math.PI*(raio*raio);
	}
}
