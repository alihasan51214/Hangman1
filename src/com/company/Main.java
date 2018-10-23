package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random randomword = new Random();
        Words secretword = new Words(randomword.nextInt(9));
        ArrayList<String> guessedLetter = new ArrayList<String>();
        Scanner scanner = new scanner(System.in);
        String  = "";
        for (int i = 0; i < secret.length(); i++)
            displaySecret += "*";

        while(game){
            guessedLetter.add(scanner.nextLine());
            int guessamount = guessedLetter.size()-1;
            String guess = guessedLetter.get(guessamount);

            if(secretword.word.contains(guess)){
                secretword.guess(true);
            } else{
                secretword.guess(false);
            }
        }
    }
}
//Made by Ali