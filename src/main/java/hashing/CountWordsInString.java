package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Started");
        String values = "Tho phir aao, mujko mujko satao. Tho phir aao, mujho satako";
        values = values.replaceAll("[,.]", " ");
        System.out.println(values);
        String[] valuesStr = values.split("\\s+");
        System.out.println(valuesStr);
        for (String value : valuesStr) {
            System.out.println(value);
        }

        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        for (String value : valuesStr) {
            value = value.toLowerCase();
            if (wordCounter.containsKey(value)) {
                wordCounter.put(value, wordCounter.get(value) + 1);
            } else {
                wordCounter.put(value, 1);
            }
        }

        Set<Map.Entry<String,Integer>> mapEntry =  wordCounter.entrySet();
        Iterator itr  = mapEntry.iterator();
        while(itr.hasNext()){
            Map.Entry mapElement  = (Map.Entry) itr.next();
            mapElement.getKey();
            mapElement.getValue();
            System.out.println("Key =>"+mapElement.getKey()+" and value=>"+mapElement.getValue());
        }
    }
}
