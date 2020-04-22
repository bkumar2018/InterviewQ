package InterviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicateWords(" java python java test python");
		
		//Using String array
		findDuplicateWordsHashSet();
	}
	
	public static void findDuplicateWords(String inStr) {
		
		//java,2  //python,1 //test, 1
		//keys are words and its value is number  of count.
		
		String words[] = inStr.split(" ");
		
		Map<String, Integer> wcount = new HashMap<String, Integer>();
		
		for(String word: words) {
			
			if(wcount.containsKey(word)) {
				wcount.put(word.toLowerCase(), wcount.get(word)+1);
			}else {
				wcount.put(word, 1);  //Add data at 1st place
			}
				
		}
		
		//extracting all the keys of map wcount
		Set<String> wordsInStr = wcount.keySet();
		
		//loop through all the words in wcount
		for(String word: wordsInStr) {
			if(wcount.get(word) > 1) {
				System.out.println(word + ": " + wcount.get(word));
			}
		}
		
	}
	
	
	public static void findDuplicateWordsHashSet() {
		
		String[] strArr = {"java", "Python", "Github", "Maven", "java", "Github"};
		
		Set<String> s = new HashSet<>();
		System.out.println(strArr.length);
			
		for(int i=0; i<strArr.length; i++) {
			if(s.add(strArr[i]) == false) {   // set when store same word again then return false.  
				System.out.println("Duplicates: "+strArr[i]);
			}
		}
		
	}

}
