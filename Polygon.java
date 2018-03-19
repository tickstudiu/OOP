public abstract class Polygon {
	protected int n;
	protected double[] sides;
	protected double area;

	abstract public void calArea();

	//constructor
	public Polygon(int nb){
		n = nb;
		sides = new double[n];
	}

	//get methods
	public double getArea(){
		return area;
	}
}