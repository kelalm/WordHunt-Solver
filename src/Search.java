public class Search {
			
	//Entry point of solver.
	//Takes board as input
	//Calls worker method to find words 
	static void search(char board[][]) { 
		
		int rows = board.length;
		int columns = board[0].length;
		
		boolean visited[][] = new boolean[rows][columns]; 
	  
	    String currentWord = ""; 
	
	    //Call worker method for each index
	    //Worker method will look at all indices around the current index.
	    for (int i = 0; i < rows; i++) {
		    for (int j=0; j < columns; j++) {
		    	searchWorker(board, visited, i, j, currentWord); 	
		    }
	    }

	} 
	
	//RECURSIVE FUNCTION to find all words on the board
	static void searchWorker(char board[][], boolean visited[][], int i, int j, String currentWord) 
	{ 
	    //Current character visited, add it to currentWord.
		visited[i][j] = true; 
	    currentWord = currentWord + board[i][j]; 
	  
	    //Refer to AnswerKey class to check if word exists
	    if (AnswerKey.isWord(currentWord)) 
	    	System.out.println(currentWord);
	  
	    //Check indexes around the current index. 
	    
	    //This calls the worker method recursively, checking if each word exists
	    //once an extra letter is added to the currentWord string.
	    for (int row = i - 1; row <= i+1 && row < 3; row++) 
	      for (int col = j-1; col <= j+1 && col < 3; col++) 
	        if (row >= 0 && col >= 0 && !visited[row][col]) 
	          searchWorker(board, visited, row, col, currentWord); 
	  
	    //Delete current character from string and mark visited of current cell as false 
	    currentWord = currentWord.substring(0, currentWord.length() - 1);
	    visited[i][j] = false; 
	}

}
