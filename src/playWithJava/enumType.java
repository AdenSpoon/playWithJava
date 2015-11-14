package playWithJava;

public class enumType {
	public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};
	public static char c;
	public static void main(String[] args) {
		Day d = Day.MON;
		System.out.println(d);
		d =Day.WED;
		System.out.println(d);
		Day t = Day.valueOf("WED");
		System.out.println(t);
		System.out.println((int)c);
		

	}

}
