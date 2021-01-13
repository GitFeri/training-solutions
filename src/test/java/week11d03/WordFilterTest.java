package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void testWordWithChars0() {

        List<String> newWords = new WordFilter().wordsWithChar(
                List.of("elso","második","harmadik"), 'x');

        assertEquals(0,newWords.size());
    }

    @Test
    public void testWordWithChars1() {

        List<String> newWords = new WordFilter().wordsWithChar(
                List.of("elso","második","harmadik","X-edik"), 'X');

        assertEquals(1,newWords.size());
        assertEquals(List.of("X-edik"),newWords);
    }

    @Test
    public void testWordWithCharsNull() {

        assertEquals(List.of(),new WordFilter().wordsWithChar(null,'x'));
    }



}