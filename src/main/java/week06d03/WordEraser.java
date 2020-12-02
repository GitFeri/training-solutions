package week06d03;

public class WordEraser {
    public String eraseWord(String words, String word) {

        StringBuilder wordsBuilder = new StringBuilder(" " + words + " ");
        String findWord = " " + word + " ";

        int foundIndex = 0;
        while (foundIndex >= 0) {
            foundIndex = wordsBuilder.indexOf(findWord);
            if (foundIndex >= 0) {
                wordsBuilder.delete(foundIndex, foundIndex + findWord.length() - 1);
            }
        }

        return wordsBuilder.toString().trim();
    }
}
