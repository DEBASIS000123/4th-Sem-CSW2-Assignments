package Q7;

public class Address {
	private int plotno;
	private String At;
	private String post;
	public Address(int plotno, String at, String post) {
		super();
		this.plotno = plotno;
		At = at;
		this.post = post;
	}
	@Override
	public String toString() {
		return "Address [plotno=" + plotno + ", At=" + At + ", post=" + post + "]";
	}
	public int getPlotno() {
		return plotno;
	}
	public void setPlotno(int plotno) {
		this.plotno = plotno;
	}
	public String getAt() {
		return At;
	}
	public void setAt(String at) {
		At = at;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
}
