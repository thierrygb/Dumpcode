package Eleicoes;

public class candidato{

	private String nome, partido;
	private int numVotos;
	public candidato(){
		nome = "";
		partido = "";
		numVotos = 0;}
	
	public void incrementaVoto(){
		numVotos ++;}
	
	public String getNome(){
		return nome;}
	
	public void setNome(String nome){
		this.nome = nome;}
	
	public String getPartido(){
		return partido;}
	
	public void setPartido(String partido){
		this.partido = partido;}
	
	public int getNumVotos(){
		return numVotos;}
	
	public void setNumVotos(int numVotos){
		this.numVotos = numVotos;}
}