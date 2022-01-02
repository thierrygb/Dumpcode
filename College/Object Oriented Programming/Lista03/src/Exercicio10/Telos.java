package Exercicio10;

public class Telos extends NoSensor {

	public int tempSensor;
	
	public Telos(int tempSensor,int x, int y, String id){
	 super();
	 this.tempSensor = tempSensor;
	 this.id = id;
		this.x= x;
		this.y = y;
	 
	}

	public int getTempSensor() {
		return tempSensor;
	}

	public void setTempSensor(int tempSensor) {
		this.tempSensor = tempSensor;
	}
	
}