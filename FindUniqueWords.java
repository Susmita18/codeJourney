package uniquewords;
import java.util.*;
import java.io.*;

public class FindUniqueWords {
	
	    public static void main(String[] args) throws FileNotFoundException {
	     
	    	   handler();
	   
	    }
	    
	    public static Scanner readFile() {
	        Scanner console = new Scanner(System.in);
	        System.out.print("What is the name of the text file? ");
	        String fileName = console.nextLine();
	        if(fileName.equals("exit")) {
	        	System.exit(1);
	        }
	        Scanner input = null;
			try {
				input = new Scanner(new File(fileName));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				 System.out.print("Wrong file entered!");
				handler();
			}
	        return input;
	    }
	   public static Map<String, Integer> createHashMap(Scanner input) {
	        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
	        while (input.hasNext()) {
	            String next = input.next().replaceAll("[^a-zA-Z0-9-']"," ").toLowerCase();
	            if (!wordCounts.containsKey(next)) {
	                wordCounts.put(next, 1);
	            } else {
	                wordCounts.put(next, wordCounts.get(next) + 1);
	            }
	        }
	        if(wordCounts.size()==0 ) {
	        	System.out.println("Blank file entered!");
	        }
	        return wordCounts;
	        }
	       
	   public static void printCount(Map<String, Integer> wordCounts) {
		   for (String word : wordCounts.keySet()) {
	            int count = wordCounts.get(word);
	                System.out.println(count + "\t" + word);
	        }
	   }
	   public static void handler() {
	    	// open the file
	    	 Scanner input = readFile();

	        // count occurrences
	    	 Map<String, Integer> wordCounts = createHashMap(input);
	    	 
	    	 //print the no of occurences
	    	 printCount(wordCounts);
	    	 handler();
	   }
}
	  
		
