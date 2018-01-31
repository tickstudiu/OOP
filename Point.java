public class Point {

	// attribute
	private float x;
	private float y;
	private float z;

	// constructor method 1
	public Point(){

	}

	// constructor method 2
	public Point(float x){
		this.x = x;
	}


	// constructor method 3
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}

	// constructor method 4
	public Point(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// getter method to get x
	public float getX(){
		return x;
	}

	// getter method to get y
	public float getY(){
		return y;
	}

	// getter method to get z
	public float getZ(){
		return z;
	}

	// setter method to set x
	public void setX(float x){
		this.x = x;
	}

	// setter method to set y
	public void setY(float y){
		this.y = y;
	}

	// setter method to set z
	public void setZ(float z){
		this.z = z;
	}

	// method show detail
	public void showDetails() {
		System.out.println("point x : " + x);
		System.out.println("point y : " + y);
		System.out.println("point z : " + z);

	}

	// method move with x y z
	public void moveWithValue(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// nethod move with point
	public void moveWithPoint(Point comprare){
		this.x = comprare.getX();
		this.y = comprare.getY();
		this.z = comprare.getZ();
	}
}