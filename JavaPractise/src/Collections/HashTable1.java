package Collections;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Hashtable<Integer, String> hm=new Hashtable<Integer, String>();
	hm.put(1, "Jan");
	hm.put(2, "Feb");
	hm.put(3, "March");
	
	System.out.println(hm.get(0));
	System.out.println(hm.get(2));
	System.out.println(hm.get(3));
	System.out.println(hm.get(4));
	
	System.out.println(hm);
	}

}
