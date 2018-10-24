package com.company;

//Made by Ali Hassan Raza

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean gamerunning = true;
        Random randomword = new Random();
        Words secretword = new Words(randomword.nextInt(9));
        System.out.println("Velkommen til Hangman, gæt ordet ved at bruge ét bogstav ad gangen, du har 8 forsøg :)");
        secretword.print();

        String input;
        Scanner scanner = new Scanner(System.in);
        while (gamerunning) {
            input = scanner.nextLine();
            if (input.length() == 1) {
                secretword.guess(input);
                secretword.print();
            } else {
                System.out.println("Indtast ét bogstav");
            }
            if (secretword.wrongguesses >= 8){
                gamerunning = false;
                System.out.println("Du er død");
            }
            if (!secretword.guessedword.contains("*")) {
                gamerunning = false;
                System.out.println("Tilykke du har gættet ordet");
            }
        }
    }
}