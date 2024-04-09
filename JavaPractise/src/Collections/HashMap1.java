package Collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Integer, String> hm=new HashMap<Integer, String>();
	 hm.put(1, "Jan");
	 hm.put(2, "Feb");
	 hm.put(3, "March");
	 hm.put(4, "April");
	
	System.out.println(hm.get(1));
	System.out.println(hm.get(3));
	System.out.println(hm.get(4));
	System.out.println(hm);
	}

}
