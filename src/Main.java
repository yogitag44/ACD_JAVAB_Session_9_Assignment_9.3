import java.util.ArrayList;//Library to use arraylist
import java.util.Collections;    //Library to use collections

class Main {
	public static void main(String[] args) {   //Main method to be called to get all the functions
		
		//passing values in the class with two parameters
		HDTV tv1 = new HDTV(55, "Samsung");     //Value1
		HDTV tv2 = new HDTV(60, "Sony");		//Value2
		HDTV tv3 = new HDTV(42, "Panasonic");	//Value3
 
		//created object of class arraylist and passing class HDTV as the variable
		ArrayList<HDTV> al = new ArrayList<HDTV>();    
		al.add(tv1);   //adding elements in arraylist
		al.add(tv2);	//adding elements in arraylist
		al.add(tv3);	//adding elements in arraylist
 
		System.out.println("Televisions in sorted order based on their Size's :\n");
		Collections.sort(al, new SizeComparator());   //Using collection class and sort method to sort using the size of TV 
		for (HDTV a : al) {    //for loop till elements are there in the list
			
			System.out.println(a.getBrand());  //Printing only brandname
		}
	}
}