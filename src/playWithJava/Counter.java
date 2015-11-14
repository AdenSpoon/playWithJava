package playWithJava;

public class Counter {
	private int count; // a simple private integer instance variable;
	
	/** The default constructor for a Counter object */
	public Counter() {count = 0;}
	
	/** An accessor method to get the current count*/
	public int getCount() {
		return count;
	}
	
	/** A modifier method for imcrementing the count */
	public void incrementCount() {
		count++;
	}
	/** A modifier method for decrementing the count */
	public void decreaseCount() {
		count--;
	}

}
