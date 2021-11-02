package ua.com.foxminded.collection;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CharCounterTest {
    @Test
    public void noStringTest() throws NullPointerException{
        String emptyString = "";
        assertThrows(NullPointerException.class, () -> {
            CharCounter charCounter = new CharCounter();
            charCounter.countChars(emptyString);
        });
    }
    @Test
    public void checkAlphabetsQuantity(){
        String checkAQuantity = "aabacaa";
        CharCounter counter = new CharCounter();
        LinkedHashMap<Character, Integer> generatedTesterMap = counter.countChars(checkAQuantity);
        int expectedQuantity = 5;
        assertThat(generatedTesterMap, hasEntry('a', expectedQuantity));

    }
    @Test
    public void checkSpacesQuantity(){
        String checkAQuantity = "abc de f g";
        CharCounter counter = new CharCounter();
        LinkedHashMap<Character, Integer> generatedTesterMap = counter.countChars(checkAQuantity);
        int expectedQuantity = 3;
        assertThat(generatedTesterMap, hasEntry(' ', expectedQuantity));

    }
    @Test
    public void checkSymbolDotsQuantity(){
        String checkAQuantity = "a.b.c. ...";
        CharCounter counter = new CharCounter();
        LinkedHashMap<Character, Integer> generatedTesterMap = counter.countChars(checkAQuantity);
        int expectedQuantity = 6;
        assertThat(generatedTesterMap, hasEntry('.', expectedQuantity));

    }
    @Test
    public void checkSymbols(){
        String checkAQuantity = "ab^$!@sdf..";
        CharCounter counter = new CharCounter();
        LinkedHashMap<Character, Integer> generatedTesterMap = counter.countChars(checkAQuantity);
        int expectedQuantity = 1;
        assertThat(generatedTesterMap, hasEntry('^', expectedQuantity));

    }
}
