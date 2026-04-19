package controller;

import model.Dictionary;

public class DictionaryController {

    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();

        dictionary.addWord("apple", "A fruit that is usually red, green, or yellow.");
        dictionary.addWord("book", "A set of written or printed pages.");
        dictionary.addWord("java", "A programming language used for software development.");
        dictionary.addWord("computer", "An electronic machine that processes data.");
    }

    public String searchMeaning(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.searchWord(word.trim());

        if (meaning == null) {
            return "Word not found in dictionary.";
        }

        return meaning;
    }
}