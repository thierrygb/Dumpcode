package estrutura;
import javax.swing.JOptionPane;

public class Destadual extends main{
	private int numero;
	private Integer integer;
	public Destadual(){
		super();
		this.numero = 0;
	}
	public int getNumero(){
		return numero;
	}
	public void setNumero(int numero) {
		if(numero >= 0&&numero <= 99999){
			this.numero = numero;
			JOptionPane.showMessageDialog(null, "DEPUTADO ESTADUAL REALIZADO");
		}
		else{
			integer = (Integer) null;
			this.numero = integer;
			JOptionPane.showMessageDialog(null, "NUMERO ERRADO " + this.numero);
		}
	}
}
