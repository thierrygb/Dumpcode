package Eleicoes;

public class prefeito extends candidato{
	
	public int numero;
	private Integer integer;
	public prefeito(){
		new candidato();
		numero = 0;}
	
	public int getNumero(){
		return numero;}
	
	public void setNumero(int numero){
		if(numero>=0&&numero<=99){
			this.numero = numero;}
		else {
			integer = (Integer) null;
			this.numero = integer;
		}
	}
}