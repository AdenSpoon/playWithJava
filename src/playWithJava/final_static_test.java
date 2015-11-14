package playWithJava;

/**
 *  In this class, I want to test the final, static feature. I also have the question written in
 *  the text book "What will happen if two methods share the same name, same parameter types, same number of parameters
 *  but have two different functionalities?"
 * */
public class final_static_test {
	public final int one = 1;
	public static int two = new Integer(2);
	public static final int three =3;
	public int four = 4;
	
	private int test_num1, test_num2;
	
	public final_static_test() {
		test_num1 = 1;
		test_num2 = 2;
	}
	
	public static void  changeValue(int a) {
		a++;
	}
	
	public void changeValue(){
		this.four++;
	}
	
	public int getOne(int one) {
		return one;
	}
	
	public int getTwo(int two) {
		return two;
	}
	
	public int getThree(int three) {
		return three;
	}
	public int arithmetic_operation(int a, int b) {
		return a + b;
	}
	
	// error occurs and eclipse asked me to rename one of the duplicate methods.
	/*	public int arithmetic_operation(int a, int c) {
		
	}
	*/
	public static void main(String[] args) {
		
		//first print two and three
		System.out.println(Integer.toString(final_static_test.two));		
		System.out.println(final_static_test.three);
		
		//try to change the value of static two using static method but failed.
		final_static_test.changeValue(final_static_test.two);
		System.out.println(final_static_test.two);
		
		//try to change the value of static two directly, it succeeded.	
		final_static_test.two++;
		System.out.println(final_static_test.two);
		
		//use instance variable to change the value of non-static variable four
		final_static_test test = new final_static_test();
		System.out.println(test.four);
		final_static_test.changeValue(test.four);
		test.changeValue();
		System.out.println(test.four);
		
		//conlusion: in Java, everything is passed by value. We cannot change the value via passing into 
		//some funtion parameter.
		

	}

}
