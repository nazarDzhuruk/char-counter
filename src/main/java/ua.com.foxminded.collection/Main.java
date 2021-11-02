package ua.com.foxminded.collection;

import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Hello world!";
        CharCounter charCounter = new CharCounter();
        LinkedHashMap<Character, Integer> inputMap = charCounter.countChars(input);
        PrintList printList = new PrintList();
        List<String> showList = printList.makePrettyView(inputMap);
        for(String all : showList){
            System.out.println(all);
        }
    }
}