package estrutura;
import javax.swing.JOptionPane;

public class Senador extends main{
	private int numero;
	private Integer integer;
	public Senador(){
		super();
		this.numero = 0;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero >= 0&&numero <= 9999){
			this.numero = numero;
			JOptionPane.showMessageDialog(null, "CADASTRO DO SENADOR REALIZADO");
		}
		else{
			integer = (Integer) null;
			this.numero = integer;
			JOptionPane.showMessageDialog(null, "NUMERO ERRADO " + this.numero);
		}
	}
}