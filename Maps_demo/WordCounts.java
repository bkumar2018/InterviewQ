package InterviewQ.Maps_demo;

import java.util.HashMap;
import java.util.Map;

public class WordCounts{

    //	public static void main(String[] args) {
//		System.out.println("Hello");
//	}
    public static void main(String[] args) {

        String text = "Java hello world hello java world java hello java";
        Map<String, Integer> wordCounts = getWordCounts(text);
        for(Map.Entry<String, Integer> entry: wordCounts.entrySet()) {
            System.out.println(entry.getKey()+ "=" + entry.getValue());
        }
    }

    public static Map<String, Integer> getWordCounts(String text) {

        HashMap<String, Integer> hmap = new HashMap();
        String[] textArr= text.toLowerCase().split("\\s+");

        for(String word: textArr) {
            hmap.put(word, hmap.getOrDefault(word, 0)+1);
        }

        return hmap;
    }

}

