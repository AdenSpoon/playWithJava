package playWithJava;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

public class playScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your age in years:");
		double age = s.nextDouble();
		System.out.println("Please enter your name:");
		String name = s.next();	
		System.out.println("Please enter your words:");
		String words = s.nextLine();
		System.out.println(words);
		s.close();

		

	}

}
