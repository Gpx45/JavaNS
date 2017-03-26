
public class GradeBook_Test {

	public static void main(String[] args){
		
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook myGradeBook = new GradeBook(
			"Intro to This Shit", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
		
	}
	
}
