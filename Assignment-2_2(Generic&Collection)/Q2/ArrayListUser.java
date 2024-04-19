package Q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayListUser {

	public static void main(String[] args) {
		ArrayList<User> ArrayListUser=new ArrayList<>();
		ArrayListUser.add(new User("A",11));
		ArrayListUser.add(new User("B",20));
		ArrayListUser.add(new User("C",10));
		
		System.out.println("User Detils:");
		for(int i=0;i<ArrayListUser.size();i++) {
			User temp=ArrayListUser.get(i);
			System.out.println(temp);
		}
		agecomprator ac=new agecomprator();
		Collections.sort(ArrayListUser,ac);
		
		System.out.println("After Sorting by age:");
		for(int i=0;i<ArrayListUser.size();i++) {
			User temp=ArrayListUser.get(i);
			System.out.println(temp);
		}
		
	}

}
class agecomprator implements Comparator<User>{
	@Override
	public int compare(User u1, User u2) {
		
		return Integer.compare(u1.getAge(),u2.getAge());
	}
}
