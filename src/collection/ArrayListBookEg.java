package collection;

import java.util.ArrayList;
import java.util.List;
class BookRequiredDetails{
	int id,quantity;
	String Name, Author;
	public BookRequiredDetails(int Bid,String BName, String BAuthor, int Bquantity){
		this.id=Bid;
		this.Name=BName;
		this.Author=BAuthor;
		this.quantity=Bquantity;
	}
	
}

public class ArrayListBookEg {

	public static void main(String[] args) {
		List<BookRequiredDetails> al = new ArrayList<BookRequiredDetails>();
		BookRequiredDetails B1 = new BookRequiredDetails(1001,"Agni Siragugal","Kalam",12);
		BookRequiredDetails B2 = new BookRequiredDetails(1002,"Half GF","Chetan bhagat",14);
		BookRequiredDetails B3 = new BookRequiredDetails(1003,"Room No 101","Salmon",15);
		BookRequiredDetails B4 = new BookRequiredDetails(1004,"Revolution2020","chetan bhagat",19);
		
		al.add(B1);
		al.add(B2);
		al.add(B3);
		al.add(B4);
		for(BookRequiredDetails b : al) {
			System.out.println(b.id+" "+b.Name+" "+b.Author+" "+b.quantity);
		}

	}

}


