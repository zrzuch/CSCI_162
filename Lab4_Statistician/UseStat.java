public class UseStat {

	public static void main(String[] args) {
		Statistician s = new Statistician();
		s.nextNumber(1.1);
		s.nextNumber(-2.4);
		s.nextNumber(0.8);
		System.out.println("length = " + s.length());
		System.out.println("last = " + s.last());
		System.out.println("sum = " + s.sum());
		System.out.println("mean = " + s.mean());
		System.out.println("smallest = " + s.smallest());
		System.out.println("largest = " + s.largest());
	}
}
