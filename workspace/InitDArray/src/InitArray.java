
public class InitArray {

	public static void main(String[] args){
		
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
		
		System.out.println("Values in array1 by row are");
		outputArray(array1);
		
		System.out.println("\nValues in array2 by row are");
		outputArray(array2);
	}
	
	public static void outputArray(int[][] array){
		int total = 0;
		for (int row = 0; row < array.length; row++){
			
			for (int column = 0; column < array[row].length; column++){
				System.out.printf("%d ", array[row][column]);
				total += array[row][column];}
			
			System.out.println();
		}
		System.out.printf("Your total from all the indicies: %d", total);
	}
	
}
