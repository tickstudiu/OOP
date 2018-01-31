public class Point {

	// attribute
	private int x;
	private int y;
	private int z;

	// constructor method 1
	public Point(){

	}

	// constructor method 2
	public Point(int x){
		this.x = x;
	}


	// constructor method 3
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	// constructor method 4
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// getter method to get x
	public int getX(){
		return x;
	}

	// getter method to get y
	public int getY(){
		return y;
	}

	// getter method to get z
	public int getZ(){
		return z;
	}

	// setter method to set x
	public void setX(int x){
		this.x = x;
	}

	// setter method to set y
	public void setY(int y){
		this.y = y;
	}

	// setter method to set z
	public void setZ(int z){
		this.z = z;
	}

	// method show detail
	public void showDetails() {
		System.out.println("point x : " + x);
		System.out.println("point y : " + y);
		System.out.println("point z : " + z);

	}

	// method move with x y z
	public void moveWithValue(int x, int y, int z){
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