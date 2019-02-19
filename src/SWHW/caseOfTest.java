package SWHW;
import static org.junit.Assert.*;

import org.junit.Test;


public class caseOfTest {

	

		@Test
		public void first_test() {

			SC sc = new SC();
			int rr = 0;
			
			assertTrue(0==SC.count());
			
		}
		
		@Test
		public void second_test() {
			String name="java";
			int price=127;
			int countOfBooks=1;
			book b=new book(name,price);
			SC cart=new SC();
			cart.addbooks(b);
			
			assertTrue(price == cart.getprice());
			assertTrue(countOfBooks==cart.count());
		}
		
		@Test
		
		public void third_test() {
			
			int price=227;
			int countOfBooks=2;
			book b=new book("java",127);
			book b2 =new book("web",100);
			SC cart=new SC();
			cart.addbooks(b);
			cart.addbooks(b2);

			assertTrue(price == cart.getprice());
			assertTrue(countOfBooks==cart.count());

		}
	}


