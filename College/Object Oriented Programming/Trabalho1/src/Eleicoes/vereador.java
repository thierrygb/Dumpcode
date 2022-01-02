package Eleicoes;

public class vereador extends candidato {
	
	public int numero;
	private Integer integer;
	public vereador(){
		new candidato();
		numero = 0;}
	
	public int getNumero(){
		return numero;}
	
	public void setNumero(int numero){
		if(numero>=0&&numero<=99999){
			this.numero = numero;}
		else{
			integer = (Integer) null;
			this.numero = integer;
		}
	}
}