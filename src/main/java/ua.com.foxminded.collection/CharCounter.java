package ua.com.foxminded.collection;

import java.util.*;

public class CharCounter {
    public LinkedHashMap<Character, Integer> countChars(String string) {
        if(string.isEmpty()){
            throw new NullPointerException("String has not been input!!!");
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char wordToLetter = string.toLowerCase().charAt(i);
            if (map.containsKey(wordToLetter)) {
                int quantity = map.get(wordToLetter);
                map.put(wordToLetter, ++quantity);
            } else {
                map.put(wordToLetter, 1);
            }
        }
        return map;
    }
}