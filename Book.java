public class Book {
	
	// attribute
	private String title;
	private int numberOfpage;

	// constructor method 1 
	public Book(){

	}

	// constructor method 2
	public Book(String title){
		this.title = title;
	}

	// constructor method 3
	public Book(String title, int numberOfpage){
		this.title = title;
		this.numberOfpage = numberOfpage;
	}

	// getter method to get title
	public String getTitle(){
		return title;
	}

	// getter method to get number of page
	public int getnumberOfpage(){
		return numberOfpage;
	}

	// setter method to set title form book pointed
	public void setTitle(String title){
		this.title = title;
	}

	// setter method to set number of page form book pointed
	public void setnumberOfpage(int numberOfpage){
		this.numberOfpage = numberOfpage;
	}

	// method show detail
	public void showDetails() {
		System.out.println(title);
		System.out.println(numberOfpage);
	}

	// ------- more infomation -------- //
	// http://mystou.com/java-constructor/
}