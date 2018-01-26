public class Book {
	
	// attribute
	private String title;
	private int numberOfPage;
	private String authorName;

	// constructor method 1 
	public Book(){

	}

	// constructor method 2
	public Book(String title){
		this.title = title;
	}

	// constructor method 3
	public Book(String title, int numberOfPage){
		this.title = title;
		this.numberOfPage = numberOfPage;
	}

	// constructor method 4
	public Book(String title, int numberOfPage, String authorName){
		this.title = title;
		this.numberOfPage = numberOfPage;
		this.authorName = authorName;
	}

	// getter method to get title
	public String getTitle(){
		return title;
	}

	// getter method to get number of page
	public int getnumberOfPage(){
		return numberOfPage;
	}

	// getter method to get author name
	public String getauthorName(){
		return authorName;
	}

	// setter method to set title form book pointed
	public void setTitle(String title){
		this.title = title;
	}

	// setter method to set number of page form book pointed
	public void setnumberOfPage(int numberOfPage){
		this.numberOfPage = numberOfPage;
	}

	// setter method to set author name form book pointed
	public void setauthorName(String authorName){
		this.authorName = authorName;
	}

	// method show detail
	public void showDetails() {
		System.out.println(title);
		System.out.println(numberOfPage);
	}

	// method same book
	public boolean sameBook(String title, int numberOfPage, String authorName){
		if (this.title == title && this.numberOfPage == numberOfPage && this.authorName == authorName) {
			return true;
		}
		else{
			return false;
		}
	}

	// ------- more infomation -------- //
	// http://mystou.com/java-constructor/
}