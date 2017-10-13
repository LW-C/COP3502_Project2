//Note: some of this code was copied from my Project 1 code

import java.util.*;

public class CharSorter
{
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

    }
}
