/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author D-20
 */
import java.util.Random;
import java.util.Scanner;

public class Game {
    private int secretNumber:
    private int gussLimit;
    
    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public void generateNumber() {
        Random random = new random();
        secretNumber = random.nextInt(100) + 1; // Contoh: 1-100        
    }
    
    public String checkGuess(int Guess) {
        if (guess == secretNumber) {
            return "Benar!";            
        } else if (guess > secretNumber) {
            return "Terlalu tinggi, coba lagi!";
        } else {
            retun "Terlalu rendah, coba lagi";
        }
    }
    
    public void play() { 
        generateNumber();
        int remainingGuesses = guessLimit;
        
        while (remainingGuesses > 0) {
            int guess = getGuess();
            string feedback = checkGuess(guess);
            System.out.println(feedback);
            
            if (feedback.equals("Benar!")) {
                break;
            }
            
            remainingGuesses--;
            System.out.println("Sisa tebakan : " + remainingGuesses);
        }
        
        if (remainingGuesses == 0) {
            System.out.println("Maaf, Anda kehabisan tebakan. Angka rahasia adalah : " + secretNumber);
        }
    }
}
