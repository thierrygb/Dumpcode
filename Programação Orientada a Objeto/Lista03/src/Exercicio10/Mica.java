package Exercicio10;

public class Mica extends NoSensor {

	public int ruidoSensor;

	public Mica(int ruidoSensor,int x, int y, String id){
		super();	
		this.ruidoSensor = ruidoSensor;
		this.id = id;
		this.x= x;
		this.y = y;
		
	}

	public int getRuidoSensor() {
		return ruidoSensor;
	}

	public void setRuidoSensor(int ruidoSensor) {
		this.ruidoSensor = ruidoSensor;
	}
	
}