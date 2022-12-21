package oops.abstruction;

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("car is reparired");
	}
	

	public static void main(String[] args) {
	
		WagonR WagonR = new WagonR();
		
		
		
		
		repairCar(WagonR);
		
	}

}
