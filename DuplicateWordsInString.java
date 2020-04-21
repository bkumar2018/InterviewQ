package InterviewQ;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicateWords(" java python java test python");
	}
	
	public static void findDuplicateWords(String inStr) {
		
		String words[] = inStr.split(" ");
		
		Map<String, Integer> wcount = new HashMap<String, Integer>();
		
		for(String word: words) {
			
			if(wcount.containsKey(word)) {
				wcount.put(word.toLowerCase(), wcount.get(word)+1);
			}else {
				wcount.put(word, 1);
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

}
