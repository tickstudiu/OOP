import java.util.*;

public class Dice{

	// dice code
	private int face;

	// constructor
	public Dice(){
		this.face = 1;
	}

	// method roll the dice
	public void roll(){
		Random rn = new Random();
		this.face = rn.nextInt(6) + 1;
	}
	

	// method show dice
	public int getFace(){
		return face;
	}

	// method Override class's object
	public String toString(){
		return "Face = " + this.face;
	}
}