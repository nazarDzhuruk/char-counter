package ua.com.foxminded.collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PrintList {
    private String quotes = "'";
    private String space = " ";
    private String dash = "-";


    public List<String> makePrettyView(LinkedHashMap<Character, Integer> getChars) {
        List<String> strings = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : getChars.entrySet()) {
            Integer allQuantities = entry.getValue();
            Character allChars = entry.getKey();
            String allQuantitiesToString = dash + space + allQuantities;
            String allCharsToString = quotes + allChars + quotes + space;
            String comboString = allCharsToString + allQuantitiesToString;

            strings.add(comboString);
        }
        return strings;
    }
}
