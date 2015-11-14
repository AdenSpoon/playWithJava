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
		// Day t = Day.valueOf("NODAY"); This line of code will be thought as error during running time
		System.out.println(t);
		System.out.println((int)c);
		/* primitive cast from char to int will change the char value into its ASCII value if it's a non-digit
		 * A safer cast method named Character.getNumericValue(int) is helpful if you only want to cast a digit char into a int number
		 * If you do not assign anything to the char variable, its int value is 0;
		 */

	}

}
