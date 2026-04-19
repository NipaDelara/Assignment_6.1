package model;

import java.util.HashMap;

public class Dictionary {

    private final HashMap<String, String> words;

    public Dictionary() {
        words = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        words.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {
        return words.get(word.toLowerCase());
    }
}