public class Square extends Polygon{
	public Square(double l){
		super(2);
		sides[0] = l;
		sides[1] = l;
	}
	public void calArea(){
		area = sides[0]*sides[1];
	}
}