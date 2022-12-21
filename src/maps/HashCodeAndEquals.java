package maps;

import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
	Pen pen1 = new Pen(10 , "blue");	
    Pen pen2 = new Pen(10 , "blue");
    
    System.out.println(pen1);
    System.out.println(pen2);
    
//    System.out.println(pen1.equals(pen2));
    
    Set<Pen> pens = new HashSet<>();
    pens.add(pen1);
    pens.add(pen2);
    
    System.out.println(pens);
	}

}

class Pen {
	
	int price;
	String colour;
	
	public Pen(int price , String colour) {
		this.price = price;
		this.colour = colour;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) return false;
//		Pen that = (Pen) obj;
//		if(this.x != that.x) return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		return price + colour.hashCode();
//	}
	
}
