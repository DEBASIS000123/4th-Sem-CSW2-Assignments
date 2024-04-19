package Q2;

public class Book {
	private int Bookid;
	private String BookName;
	private double price;
	public int getBookid() {
		return Bookid;
	}
	
	public Book(int bookid, String bookName, double price) {
		super();
		Bookid = bookid;
		BookName = bookName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", BookName=" + BookName + ", price=" + price + "]";
	}
	public boolean equals(Book o) {
		if(this.price==o.price) {
			return true;
		}
		return false;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
