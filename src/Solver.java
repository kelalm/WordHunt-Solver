import java.util.Scanner;

public class Solver {

    public static void main(String[] args) throws Exception {
    	
		System.out.println("Welcome to WordHunt Solver!");
				
		AnswerKey.createHashFromFile();
		
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboard2 = new Scanner(System.in);
		
		System.out.println("Enter the dimmensions of your board, in rows and columns format.");
		
		int rows = keyboard.nextInt();
		int columns = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println("Entered rows: " + rows);
		System.out.println("Entered columns: " + columns);
		
		int numberOfLetters = rows * columns;
		
		System.out.println("Thanks! Now enter your desired " + numberOfLetters + " characters: ");
		
		String enteredCharacters = keyboard2.nextLine();
		
		keyboard2.close();
		
		int offset = 0;
		char enteredBoard[][] = new char[rows][columns];

		
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < columns; j++) {
		        enteredBoard[i][j] = enteredCharacters.charAt(offset++);
		        System.out.print(enteredBoard[i][j]);
		    }
		}
		
		Search.search(enteredBoard);
		
    }
}