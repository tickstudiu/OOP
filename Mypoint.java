public class Mypoint {
	public static void main(String[] args) {
		Point pt = new Point(3,5,10);
		Point pt2 = new Point(5,4,7);

		pt.showDetails();
		pt2.showDetails();

		pt.moveWithValue(4,3,7);
		pt.showDetails();
		
		pt.moveWithPoint(pt2);
		pt.showDetails();

	}
}