package Exercicio01;

class Caminhao extends Veiculo{

		private int num_eixos;
		private double carga;
		
		public Caminhao(){
			super();
			this.num_eixos = 0;
			this.carga = 0;
			}
		
		public int getNum_eixos(){
			return num_eixos;
			}
		public void setNum_eixos(int num_eixos){
			this.num_eixos = num_eixos;
			}
		public double getCarga(){
			return carga;
			}
		public void setCarga(double carga){
			this.carga = carga;
			}
		public String todosDados(int num_eixos, double carga){
			String dadoscaminhao ="";
			dadoscaminhao += "\nNúmero de Eixos: " +num_eixos+ "\nCarga: " +carga;;
			return dadoscaminhao;
			}
}