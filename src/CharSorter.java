//Note: some of this code was copied from my Project 1 code

import java.util.*;

public class CharSorter
{
    //The goal of this method is to record the frequencies
    //of all the characters in the string from the user
    public static int[] recordFrequencies(String userInput, char[] ascii)
    {
        int[] frequencies = new int[95];

        for(int index = 0; index < userInput.length(); index++)
        {
            char character = userInput.charAt(index);

            for(int num = 0; num < ascii.length; num++)
            {
                if (character == ascii[num])
                    frequencies[num]++;
            }
        }
        return frequencies;
    }


    //The goal of this method is to sort all of the
    //characters in alphabetical order.
    //Argument and return types can be changed.
    public static String[] alphabeticalSort (String[] var)
    {

    }

    //The goal of this method is to sort all of the
    //characters from highest to lowest frequency.
    //Argument and return types can be changed.
    public static String[] frequencySort (String[] var)
    {

    }

    //The goal of this method is to sort the data into four categories:
    //Textual characters, Numeric characters, WhiteSpace characters,
    //and Symbolic characters.
    //Argument and return types can be changed.
    public static String[] charTypes (String[] var)
    {

    }

    //The goal of this method is to print the options to the
    //user, catch any errors in the input and return the user's
    //choice to the main method.
    public static int printOptionsAndCatchErrors()
    {
        int userChoice = 0;
        Boolean error = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select the option you would like to see");
        System.out.println("");
        System.out.println("1. Display character frequencies alphabetically");
        System.out.println("2. Display sorted frequencies");
        System.out.println("3. Show types of character frequencies");
        System.out.println("4. Exit");


        while (error)
        {
            try
            {
                userChoice = scanner.nextInt();

                if (userChoice < 1)
                {
                    System.out.println("\nError, bad input, please enter a number 1-4");
                }
                else if (userChoice > 4)
                {
                    System.out.println("\nError, bad input, please enter a number 1-4");
                }
                else
                {
                    error = false;
                    return userChoice;
                }
            }
            catch (InputMismatchException notAnInt)
            {
                System.out.println("\nError, bad input, please enter a number 1-4");
            }
            catch (Exception except)
            {
                System.out.println("\nError, bad input, please enter a number 1-4");
            }


            scanner.nextLine();

            System.out.println("Please select the option you would like to see");
            System.out.println("");
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
        }
        return userChoice;

    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Boolean runAgain = true;
        int choice = 1;
        String userInput;

        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");
        userInput = scanner.nextLine();
        //Send userInput to a method that records the frequencies of each character

        while (runAgain)
        {
            /**
             *  Get text from user
             *  Go to the printOptionsAndCatchErrors method to get the user's choice
             *  Carry out the choice that the user selects
             **/


            //What to do based on user's choice
            if (choice == 1) {
                //Display the character frequencies alphabetically

            } else if (choice == 2) {
                //Display the sorted frequencies

            } else if (choice == 3) {
                //Show types of character frequencies

            } else if (choice == 4) {
                //Exit sorter
                System.out.println("Character Sorter Exited Successfully");
                runAgain = false;
            }
        }


        return;
    }
}
