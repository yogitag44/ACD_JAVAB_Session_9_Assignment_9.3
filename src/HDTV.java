import java.util.ArrayList;    //Library to use arraylist
import java.util.Collections;    //Library to use collections
import java.util.Comparator;   //library to call compare function 

public class HDTV {   //Public class HDTV
	private int size;   //initialized private variable Size, to calculate size of TV
	private String brand;   //private variable to get the brand name.
 
	public HDTV(int size, String brand) {   //two parameter Constructor of class HDTV
		this.size = size;  //calling private variable of main class 
		this.brand = brand; 	//calling private variable of main class
	}
 
	public int getSize() {   //method to get size of TV
		return size;   //returning the size of TV
	}
 
	public void setSize(int size) {		//Method to set the size
		this.size = size;			//returning the size
	}
 
	public String getBrand() {		//method to get the brandName
		return brand;
	} 
 
	public void setBrand(String brand) {   //Method to set the BrandName
		this.brand = brand;
	}
}
 
class SizeComparator implements Comparator<HDTV> {    //Class implementing Comparator to compare size of televisions
	@Override    //overriding existing function
	public int compare(HDTV tv1, HDTV tv2) {   //two parameter method
		int tv1Size = tv1.getSize();    //int variable to get size 
		int tv2Size = tv2.getSize();		//int variable to get size 
 
		if (tv1Size > tv2Size) {			//Comparing size, which help in sorting the televisions
			return 1;					//return 1 if true
		} else if (tv1Size < tv2Size) {  
			return -1;			//return -1 if value is less
		} else {
			return 0;
		}
	}
}

