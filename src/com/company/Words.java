package com.company;

import java.util.ArrayList;

public class Words {
    public String[] possiblewords = new String[]{"Roskilde", "Universitet", "Genius", "Intelligent", "Hundige", "Ali", "Hussain", "Zahraa", "Karbala"};
    ArrayList<String> word = new ArrayList<String>();
    public boolean[] guess;
    public String guessedword = "";
    public int wrongguesses;
    ArrayList<String> guessedLetter = new ArrayList<String>();

    public Words(int n) {
        for(int i = 0; i<possiblewords[n].split("").length; i++) {
            word.add(possiblewords[n].split("")[i]);
        }
        guess = new boolean[word.size()];
        hideword();
    }

    public void print() {
        System.out.println(guessedword);
        System.out.println("Antal forkerte forsøg " + wrongguesses + "/8");
    }

    public void hideword() {
        guessedword = "";
        for (int i = 0; i < word.size(); i++) {
            guessedword += "*";
        }
    }

    public void guess(String letter) {
        if (!word.contains(letter)) {
            guessedLetter.add(letter);
            wrongguesses++;
        }
        guessedword = "";
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).contains(letter) || guess[i]) {
                guess[i] = true;
                guessedword += word.get(i);
            } else {
                guessedword += "*";
                guess[i] = false;
            }
        }
    }
}