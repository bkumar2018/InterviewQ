package InterviewQ.Maps_demo.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args){

        Map<String, String> hmap = new HashMap<>();
        hmap.put("key1", "data1");
        hmap.put("key2", "data2");

        for(Map.Entry<String,String> e: hmap.entrySet()){
            System.out.println("key: "+ e.getKey() + "  values  : "+ e.getValue());
        }
    }
}
