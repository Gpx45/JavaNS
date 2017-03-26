package enhancedArray;

public class enhancedForTest {
// this shows another way to make an for loop 
	//known as an "Enhanced for Loop"
	
	//Note this is only to obtain array elements not modify them
	// to modify use the original for loop
	public static void main(String[] args){
		
		int[] arr = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		for(int number : arr){
			total += number;
			
			System.out.printf("Total Elements: %d\n", total);
		}
		
	}
	
}
