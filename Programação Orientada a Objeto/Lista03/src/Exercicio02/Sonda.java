package Exercicio02;

public class Sonda {
	private String nome;
	private int lat,longi;
	public Sonda(){
		nome="";
		lat=0;
		longi=0;		
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return nome;
	}
	public void setLat(int lat){
		this.lat=lat;
	}
	public int getLat(){
		return lat;
	}
	public void setLongi(int longi){
		this.longi=longi;
	}
	public int getLongi(){
		return longi;
	}
}