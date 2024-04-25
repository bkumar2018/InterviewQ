package InterviewQ.Maps_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTravese {

    public static void main(String[] args) {

        HashMap<String, Integer> hmap = new HashMap<>();
        hmap.put("Birender",13955);
        hmap.put("Anand",13945);
        hmap.put("Sanjay",13935);
        hmap.put("Balram",13975);

        // Printing the HashMap
        System.out.println("Created hashmap is" + hmap);


        //1. Traverse using Iterator
        // Getting an iterator
        Iterator hmIterator = hmap.entrySet().iterator();

        // Iterate through the hashmap
        // and add some bonus marks for every student
        System.out.println("HashMap after adding bonus marks:");

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int marks = ((int)mapElement.getValue() + 10);
            System.out.println(mapElement.getKey() + " : " + marks);
        }

    }

}

