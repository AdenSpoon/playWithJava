package playWithJava;

public class controlFlow {
	/*loop over a 2D array. Accidentally, I found that no methods can be defined in other methods(and the main method is no special case here */
	public static boolean findZero(int[][] a) {
		boolean foundFlag = false;
		zeroSearch:
		for(int i = 0; i < a.length; i++) 
			for(int j = 0; j < a[i].length; j++) {
				if(0 == a[i][j]) {
					foundFlag = true;
					break zeroSearch;
				//	return foundFlag;
				}
			}
		return foundFlag;
	}

	public static void main(String[] args) {
		
	/*	if(1) {
			
		}
		while(1) {
			
		}
	The value tested by if or while statement must be boolean expression, integer is not allowed	
	 */
		if(true) {
			
		}
		while(true) {
			break;
		}
		
		/*test the findZero method */
		int[][] a = {{1,2,3},{2,3,4},{1,0,9,0}};
		System.out.println(controlFlow.findZero(a));
		
		
	}
	

}
