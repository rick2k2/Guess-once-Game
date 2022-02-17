//Number Guess Game 2: DEVELOPED RICK SAHA

package com.javafull;
import java.util.Scanner;
import java.util.Random;

class Game{

    public int number;
    public int inputNumber;
    public int numberofGuess=0;


//    getnumberofguess Setter
    public void setnumberofGuess(int numberofGuess)
    {
        this.numberofGuess=numberofGuess;
    }
//    getNumberofguess geater
    public int getNumberofGuess()
    {
        return numberofGuess;
    }

     Game()
    {
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }

    public void TakeUserInput()
    {
        System.out.println("Guess the number:-");
        Scanner sc =new Scanner(System.in);
        inputNumber =sc.nextInt();
    }
    public boolean IsCorrectNumber()
    {
        numberofGuess++;
        if(inputNumber==number) {
            System.out.printf("You are guessed right number it was:-%d\nYou Successfully guess after %d attempts",number,numberofGuess);
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Number is too low...");
        }
        else if(inputNumber>number)
        {
            System.out.println("Number is too high...");
        }
            return false;
    }

}



public class lec50 {
//    Exercise shout_out and solve Guess the number Game
public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while (!b) {
        g.TakeUserInput();
        b = g.IsCorrectNumber();
        }
}
}
