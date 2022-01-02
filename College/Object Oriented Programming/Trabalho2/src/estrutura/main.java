package estrutura;

public abstract class  main 
{
	private String NOME;
	private String PARTIDO;
	private long numvoto;
	
	public main(){
		NOME="";
		PARTIDO="";
		numvoto=0;
	}
	public void setNome(String nome) {
		this.NOME = nome;
	}
	public String getNome() {
		return NOME;
	}
	public void setPartido(String partido) {
		this.PARTIDO = partido;
	}
	public String getPartido() {
		return PARTIDO;
	}
	public void setNumVotos() {
		this.numvoto++;
	}
	public long getNumVotos() {
		return numvoto;
	}
	public abstract int getNumero();
}
