package ua.com.foxminded.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PrintListTest {
    private List<String> actual;
    @Test
    public void testProperView(){
        String testedString = "Hello world!";
        List<String> expected = Arrays.asList("'h' - 1",
                "'e' - 1",
                "'l' - 3",
                "'o' - 2",
                "' ' - 1",
                "'w' - 1",
                "'r' - 1",
                "'d' - 1",
                "'!' - 1");
        makeList(testedString);
        assertEquals(expected, actual);
    }
    public void makeList(String input){
        CharCounter counter = new CharCounter();
        PrintList printList = new PrintList();
        LinkedHashMap<Character, Integer> expectedMap = counter.countChars(input);
        actual = printList.makePrettyView(expectedMap);
    }

}
