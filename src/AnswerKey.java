import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class AnswerKey {
	
	//This class stores the dictionary definitions from the text file into a Hash Set
	//This allows for quick comparison and unique storage!
	
	private static HashSet<String> solutions = new HashSet<String>();
	
	//Parse text file and store words into hash set.
    static void createHashFromFile() throws Exception{
        String currentLine;
        //BufferedReader reader = new BufferedReader(new FileReader("anagramssolutionkeyfinal.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("wordsolutions.txt"));

        while((currentLine = reader.readLine()) != null){
            solutions.add(currentLine);
        }

        reader.close();
    }
    
    //Used to check if a word exists in the hash set. 
    static boolean isWord(String word) {
    	if(solutions.contains(word) && word.length() > 3) 
    		return true;
    	return false;
    }
    
}
