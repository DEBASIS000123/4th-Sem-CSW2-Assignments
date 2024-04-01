package Q7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<String, Address> map=new TreeMap();
		map.put("Oggy", new Address(10,"CN","Cnn"));
		map.put("Bob", new Address(11,"CN","Cnn"));
		map.put("Ali", new Address(21,"CN","Cnn"));
		
		
		System.out.println("TreeMap Detils:");
		Iterator<Map.Entry<String, Address>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Address> temp=itr.next();
			System.out.println("Name="+temp.getKey()+" "+temp.getValue());
		}

	}

}
