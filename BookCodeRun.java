package arrayList;

import java.util.ArrayList;

public class BookCodeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderProcessor oBook1 = new OrderProcessor();
		//ArrayList<Book> temp = new ArrayList<Book>(oBook1.getOrderfromCustomer());
//Book- class type, book class objects stored, getorder passed as parameter as it returns the object.
		//oBook1.printOrderDetails(temp);
		oBook1.printOrderDetails(oBook1.getOrderfromCustomer());
	}

}
