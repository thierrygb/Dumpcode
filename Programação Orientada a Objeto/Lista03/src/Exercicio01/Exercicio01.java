package Exercicio01;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Exercicio01 extends JApplet{	
	public void init() {
		Mes [] vetormeses = new Mes[12];
		boolean opcaosair = true;
		String opcoes;
		int op;
		Mes maiorsaldo = new Mes("",0,0,0);
		double mediasalarios;
		double somasalarios = 0;
		
		for(int i=0; i<vetormeses.length;i++){
			
			String nomemes = JOptionPane.showInputDialog("Digite o nome do mês " + (i+1));
			String salariomes = JOptionPane.showInputDialog("Digite o salário do mês de " + nomemes);
			String gastosmes = JOptionPane.showInputDialog("Digite os gastos do mês de " + nomemes);
			String impostomes = JOptionPane.showInputDialog("Digite os impostos do mês de " + nomemes);
			double salariomesconvertido = Double.parseDouble(salariomes);
			double gastosmesconvertido = Double.parseDouble(gastosmes);
			double impostomesconvertido = Double.parseDouble(impostomes);
			vetormeses[i] = new Mes(nomemes,salariomesconvertido,gastosmesconvertido,impostomesconvertido);
		}
		while(opcaosair){
		
			opcoes = JOptionPane.showInputDialog("(1) - Mostrar dados do mês de maior saldo\n(2) - Média dos salários\n"
					+ "(3) - Dados dos meses\n(4) - Sair");
			op = Integer.parseInt(opcoes);
			switch (op) {
			case 1:{
				maiorsaldo = vetormeses[0];
				for(int i=1;i<vetormeses.length;i++){
					if(maiorsaldo.saldo()<vetormeses[i].saldo()){
						maiorsaldo=vetormeses[i];
					}
				}
				String imprime = "Mês = " + maiorsaldo.getNome() + "\nSalário = " + maiorsaldo.getSalario() + 
						"\nGastos = " + maiorsaldo.getGastos() + "\nImpostos = " + maiorsaldo.getImpostos() +
						"\n\nSaldo = " + maiorsaldo.saldo();
				JOptionPane.showMessageDialog(null, imprime);
				break;
			}
			case 2:{
				for(int i=0;i<vetormeses.length;i++){
					somasalarios+=vetormeses[i].getSalario();
				}
				mediasalarios=somasalarios/12;
				JOptionPane.showMessageDialog(null, "A média dos salários é:\n" + mediasalarios);
				break;
			}
			case 3:{
				String imprime="";
				for(int i=0;i<vetormeses.length;i++){
					imprime += "Mês = " + vetormeses[i].getNome() + "\nSalário = " + vetormeses[i].getSalario() +
							"\nGastos = " + vetormeses[i].getGastos() + "\nImpostos = " + vetormeses[i].getImpostos() + 
							"\nSaldo = " + vetormeses[i].saldo()+"\n\n";
				}
				JOptionPane.showMessageDialog(null, "-- Balanço Anual --\n" + imprime);
				break;
			}
			case 4:{
				opcaosair = false;
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente! Clique em 'Ok' para voltar ao menu!");
				break;
			}
		}
		System.exit(0);
	}
}
class Mes{
	private String nome;
	private double salario;
	private double gastos;
	private double impostos;
	
	double saldo(){
		return ( getSalario() - (getGastos() + getImpostos()) );
	}
	Mes(String nomeaserpassado, double salarioaserpassado, double gastoaserpassado, double impostoaserpassado){
	setNome(nomeaserpassado);
	setSalario(salarioaserpassado);
	setGastos(gastoaserpassado);
	setImpostos(impostoaserpassado);
	saldo();
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	public double getImpostos() {
		return impostos;
	}
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
}
