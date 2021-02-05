package com.company;
//Allows user input
import java.util.Scanner;
public class Main {


    public static void main(String[] args)
    {
        print("\n\n\n****The White Room****\n");
        Intro();
    }
    static void Intro()
    {
        print("Welcome to The White Room. What is your name?");
        print("My name is: ");
        Scanner userAnswer = new Scanner(System.in);
        String userChoice;
        userChoice = userAnswer.nextLine();
        print("Welcome " + userChoice);
        FirstChoice();
    }


    static void FirstChoice()
    {
        print("White Room is a text adventure game where you answer with a letter to indicate your choice.");
        print("There are 4 possible endings, but one hidden ending is the true ending.");
        print("You find yourself in a room with only one door in front of you. You have no memory of how yoo got here. What do you do?");
        print("A. Open the door\nB. Look around the room some more\nC. Wait");
        print("I will choose: ");
        Scanner userAnswer = new Scanner(System.in);
        String userChoice;
        userChoice = userAnswer.nextLine();
        if (userChoice.equals("A") || userChoice.equals("a"))
        {
            OpenDoor1();
        }
        else if (userChoice.equals("B") || userChoice.equals("b"))
        {
            Look();
        }
        else if (userChoice.equals("C") || userChoice.equals("c"))
        {
            Wait();
        }
        else
        {
            print("Nothing");
        }
    }

    static void OpenDoor1()
    {
        print("West");
    }
    static void Look()
    {
        print("Other than the door, there is only a single keypad with a screen above it. There are no windows or other means of escape.");
        print("A. Open the door\nB. Enter a number into the keypad\nC. Wait");
        print("I will choose: ");
        Scanner userAnswer = new Scanner(System.in);
        String userChoice;
        userChoice = userAnswer.nextLine();
        if (userChoice.equals("A") || userChoice.equals("a"))
        {
            OpenDoor1();
        }
        else if (userChoice.equals("B") || userChoice.equals("b"))
        {
            Keypad();
        }
        else if (userChoice.equals("C") || userChoice.equals("c"))
        {
            Wait();
        }
        else
        {
            print("Error: Answer not recognized.");
        }
    }
    static void Keypad()
    {
        Scanner userAnswer = new Scanner(System.in);
        int userChoice;
        userChoice = userAnswer.nextInt();

        if (userChoice == 6180)
        {
            TrueEnd();
        }
        else
        {
            print("The keypad flashes a red light and the numbers disappear, making sure you can't use it again. \nYou seem to have entered in an incorrect code.");
        }
    }
    static void Wait()
    {
        print("You wait.\n\n\n\n\n\n");
        print("And wait...\n\n\n");
        print("And...\n\n\n");
        print("wait....\n\n\n\n\n\n\n\n\n");
        print("Until you die of starvation.");
    }


    static void End1()
    {
        print("***Ending 1: Patience is a Virtue...Sometimes***");
        print("      GAME OVER!");
        print("As you fall through the endless void of the afterlife, a single digit flashes into your mind:");
        print("6");
    }
    static void End2()
    {
        print("***Ending 2: The Blue Pill....or was it the Red Pill?***");
        print("      GAME OVER!");
        print("As you fall through the endless void of the afterlife, a single digit flashes into your mind:");
        print("1");
    }
    static void End3()
    {
        print("***Ending 3: The Stanford Fable***");
        print("      GAME OVER!");
        print("As you fall through the endless void of the afterlife, a single digit flashes into your mind:");
        print("8");
    }
    static void End4()
    {
        print("***Ending 4: Meet the Developers***");
        print("      GAME OVER!");
        print("As you fall through the endless void of the afterlife, a single digit flashes into your mind:");
        print("0");
    }
    static void TrueEnd()
    {
        print("A panel above the keypad lowers, revealing another screen that says: ");
        print("*~*Congratulations! You have reached the True Ending!*~* \n*~*Feel free to quit the game at any time, and thank you for playing!*~*");
        print("***Ending 5: The End***");
        print("THANK YOU SO MUCH FOR TO PLAYING MY GAME!");
    }
    static void print(String text)
    {
        System.out.println(text);
    }
}

/**
 Scanner userAnswer = new Scanner(System.in);
 String userChoice;
 userChoice = userAnswer.nextLine();

 if (userChoice.equals("Answer1") || userChoice.equals("answer1"))
 {
 Choice1();
 }
 else if (userChoice.equals("Answer2") || userChoice.equals("answer2"))
 {
 Choice2();
 }
 else
 {
 print("Nothing");
 }
 */
