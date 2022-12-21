package constructer;

public class Main {
	
	public static class RectangularPair {
		int h , w , l;
		
		public RectangularPair(int h, int w, int l) {
			this.h = h;
			this.w = w;
			this.l = l;
		}
		public RectangularPair() {
			
		}
        public RectangularPair(int h) {
			this.h = this.w = this.l = h;	
		}
		public int volume() {
			return h*w*l;
		}
		public int surfaceArea() {
			return 2* (h*l + h*w + w*l);
		}
	}
	public static void test1() {
		RectangularPair rp = new RectangularPair(12, 8, 5);
		System.out.println("volume is : "+ rp.volume());
		System.out.println("surface area is : " + rp.surfaceArea());
		
		RectangularPair rp1 = new RectangularPair(12);
		System.out.println("volume is : "+ rp1.volume());
		System.out.println("surface area is : " + rp1.surfaceArea());
		
		RectangularPair rp2 = new RectangularPair();
		System.out.println("volume is : "+ rp2.volume());
		System.out.println("surface area is : " + rp2.surfaceArea());
		
	}

	public static void main(String[] args) {
		
       test1();
	}

}
