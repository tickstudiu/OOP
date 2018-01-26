public class Mybook {
	public static void main(String[] args) {

		Book mybook1;

		mybook1 = new Book();

		Book mybook2;

		mybook2 = new Book("Java Programming");

		Book mybook3;

		mybook3 = new Book("C Programming",500);

		mybook1.setTitle("OOP");

		mybook1.setnumberOfPage(1000);

		mybook2.setTitle("Network");
		mybook2.setnumberOfPage(600);

		mybook1.showDetails();
		mybook2.showDetails();
		mybook3.showDetails();

		if (mybook1.sameBook("OOP",1000,"NULL")){
			System.out.println("same");
		}
		else{
			System.out.println("not same");
		}

	}
}