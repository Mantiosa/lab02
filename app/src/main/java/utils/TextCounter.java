package utils;

public class TextCounter {
    public static int getCharsCount(String input){
        return input.length();
    }
    public static int getWordsCount(String input){
        String[] wordArray = input.trim().split("[\\s]+|[, ]+|[. ]+");
        return wordArray.length;
    }
}
