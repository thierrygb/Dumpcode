package Exercicio04;

public class Funcionario extends Empregado{
	
	private double salario;

	public Funcionario (String nome, double encargos, double salario){
		super (nome, encargos);
		this.salario = salario;
	}
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double salarioLiquido(){
		return (salario - ((getEncargos()*salario)/100));
	}
}
