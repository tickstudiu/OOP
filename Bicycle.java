public class Bicycle implements Vehicle{

	private int speed;
	private int gear;

	public Bicycle(int s,int g){
		this.speed = s;
		this.gear = g;
	} 

	public void changeGear(int a){
		gear = a;
	}
    public void speedUp(int a){
    	speed = speed + a;
    }
    public void applyBrakes(int a){
    	speed = speed - a;
    }

    public String toString(){
    	return "Gear: " + gear + "And Speed: " + speed;
    }

}
