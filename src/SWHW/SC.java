package SWHW;

import java.util.ArrayList;

public class SC {
       static ArrayList <book> li;
      public SC(){
	 li = new ArrayList<book>();
}
	public static int count() {
		// TODO Auto-generated method stub
	
	return li.size();	
		
	}

	public void addbooks(book b) {
		// TODO Auto-generated method stub
		li.add(b);
	}

	public int getprice() {
		// TODO Auto-generated method stub
		int pr =0;
	for (int i =0 ; i<li.size();i++) {
		pr=pr+li.get(i).getp();
		
	}
	
	return pr;
	}}