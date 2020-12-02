package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WordEraserTest {
    @Test
    public void testWordEraser() {

        assertEquals("", new WordEraser().eraseWord("", "alma"));
        assertEquals("körte barack birsalma szilva", new WordEraser().eraseWord("alma körte barack birsalma szilva", "alma"));
        assertEquals("körte barack birsalma szilva", new WordEraser().eraseWord("alma körte alma barack birsalma szilva alma", "alma"));
        assertEquals("körte barack birsalma szilva", new WordEraser().eraseWord("körte alma barack birsalma szilva", "alma"));
        assertEquals("körte barack birsalma szilva", new WordEraser().eraseWord("körte barack birsalma szilva", "alma"));

    }
}
