/*
Game Title :-Guess one Game :-DEVELOPED BY RICK SAHA
16/02/2022    7:57pm
In this game I us random number and user input i used here oops concept to done my all Task
 */


//instruction in this game Must be followed
/*
    Guess the number game which allows a user to play "Guess the number"
    Guess once game have following Methods
    1.Constructor to generate the random number.
    2.Takeuserinput() to take a user input of number.
    3.IscorrectNumber() is detect wheather the number entered by user is true.
    4.getter and setter for no of guses
    use properties such as noofGuses(int) ,etc to get thie task done
    */




package com.javafull;



import java.util.Random;
import java.util.Scanner;

//custom class GameOnce_Game2
class GuessOnce_Game2{
    int guessNum;
    int ranNum;

//    welcome message
    public void welcome_msg()
    {
        System.out.println("Hey guys welcome to our 'Guess Once' Game");
        System.out.println("This game is help you to increase your prediction level");
        System.out.println("Note:You got 3 chance to predict the correct Number!");
        System.out.println("Remember:-Each Chance Carry 5 points!");
        System.out.println("So without any further delay lets play this game!");
    }

//    user Input taken
    public int UserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number between 1 to 100:-");
        guessNum = sc.nextInt();
        return guessNum;
    }

    //Random number generator constructor
    public GuessOnce_Game2(){
        Random rn = new Random();
        ranNum = rn.nextInt(3);
    }

//    Methode for checking user input and random number is equall or not
    public boolean IsCorrectInput()
    {
        if(guessNum == ranNum)
        {
            return true;
        }
        else if(guessNum>ranNum)
        {
            System.out.println("Your Guess num is greater than our Number!");
            return false;
        }
        else if (guessNum<ranNum)
        {
            System.out.println("Your Guess number is Lesser than our Number!");
            return false;
        }
        else{
            return false;
        }
    }


////    greater number
//    public void greater()
//    {
//
//    }
//
//    //    lesser number
//    public void lesser()
//    {
//
//    }

    //    lesser number
    public void win()
    {
        if (guessNum==ranNum)
        {
            System.out.println("Your Guess number is correct you win!");
        }
    }

}



//Main class
public class GuessOnce_Game1 {
    public static void main(String[] args) {
        GuessOnce_Game2 p1 = new GuessOnce_Game2();
        p1.welcome_msg();

        int score=0;

//        chance 3 each chance takes 5 points;
        int n=3;
        for (int i=1;i<=n;i++)
        {
            System.out.println("Guess Attempt :-"+i);
            p1.UserInput();
            System.out.println(p1.ranNum);

            if(p1.IsCorrectInput())
            {
                p1.win();
                score+=5;
                System.out.println("You got "+score+" points!");
            }
            else {
                score=0;
                System.out.println("you got "+score+" points!");
            }
        }

        System.out.println("Your Score after "+n+" Attempts is:- "+score);
    }
}
