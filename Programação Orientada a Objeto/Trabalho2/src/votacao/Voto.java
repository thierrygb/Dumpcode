package votacao;
import javax.swing.*;

public class Voto extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private VotoPRE votopre;
	private VotoGOV votogov;
	private VotoSEN votosen;
	private VotoDF votoDF;
	private VotoDE votoDE;
	
	public Voto(){
	
		votoDE();
		votoDF();
		votosen();
		votogov();
		votopre();}
	
	public void votopre(){
		setVotopre(new VotoPRE());
	}
	public void votogov(){
		setVotogov(new VotoGOV());
	}
	public void votosen(){
		setVotosen(new VotoSEN());
	}
	public void votoDF(){
		setVotoDF(new VotoDF());
	}
	public void votoDE(){
		setVotoDE(new VotoDE());
	}

	public VotoPRE getVotopre() {
		return votopre;
	}

	public void setVotopre(VotoPRE votopre) {
		this.votopre = votopre;
	}

	public VotoGOV getVotogov() {
		return votogov;
	}

	public void setVotogov(VotoGOV votogov) {
		this.votogov = votogov;
	}

	public VotoSEN getVotosen() {
		return votosen;
	}

	public void setVotosen(VotoSEN votosen) {
		this.votosen = votosen;
	}

	public VotoDF getVotoDF() {
		return votoDF;
	}

	public void setVotoDF(VotoDF votoDF) {
		this.votoDF = votoDF;
	}

	public VotoDE getVotoDE() {
		return votoDE;
	}

	public void setVotoDE(VotoDE votoDE) {
		this.votoDE = votoDE;
	}
}