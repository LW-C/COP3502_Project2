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
    public static void alphabeticalSort (char[] ascii, int[] frequencies)
    {
        for(int index = 0; index < ascii.length; index++)
        {
            if(frequencies[index] > 0)
            {
                System.out.println(ascii[index] + " freq: " + frequencies[index]);
            }
        }
        System.out.println();
    }

    //The goal of this method is to sort all of the
    //characters from highest to lowest frequency.
    public static void frequencySort (char[] ascii, int[] frequencies)
    {
        int highest = 0;

        System.out.println("The sorted by frequency characters are:\n");

        for(int index = 0; index < frequencies.length; index++)
        {
            if(highest < frequencies[index])
                highest = frequencies[index];
        }

        for(int num = highest; num > 0; num--)
        {
            for(int index = 0; index < frequencies.length; index++)
            {
                if (frequencies[index] == num)
                    System.out.println(ascii[index] + " freq: " + frequencies[index]);
            }
        }
    }

    //The goal of this method is to sort the data into four categories:
    //Textual characters, Numeric characters, WhiteSpace characters,
    //and Symbolic characters.
    public static void charTypes (int[] frequencies)
    {
        int textual = 0;
        int numerical = 0;
        int whiteSpace = 0;
        int symbol = 0;

        if (frequencies[0] > 0)
            whiteSpace += frequencies[0];

        for(int index = 1; index < 16; index++)
            symbol += frequencies[index];

        for(int index = 16; index < 26; index++)
            numerical += frequencies[index];

        for(int index = 26; index < 33; index++)
            symbol += frequencies[index];

        for(int index = 33; index < 59; index++)
            textual += frequencies[index];

        for(int index = 59; index < 65; index++)
            symbol += frequencies[index];

        for(int index = 65; index < 91; index++)
            textual += frequencies[index];

        for(int index = 91; index < 95; index++)
            symbol += frequencies[index];

        System.out.println("Textual Character count: " + textual);
        System.out.println("Numerical Character count: " + numerical);
        System.out.println("WhiteSpace Character count: " + whiteSpace);
        System.out.println("Symbol Character count: " + symbol);
    }

    //The goal of this method is to print the options to the
    //user, catch any errors in the input and return the user's
    //choice to the main method.
    public static int printOptionsAndCatchErrors()
    {
        int userChoice = 0;
        Boolean error = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease select the option you would like to see\n");
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

            System.out.println("\nPlease select the option you would like to see\n");
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
        }
        return userChoice;

    }

    public static char[] createAscii()
    {
        char[] ascii = new char[95];
        //Put all of the variables in the ascii array
        ascii[0]  = ' ';
        ascii[1]  = '!';
        ascii[2]  = '"';
        ascii[3]  = '#';
        ascii[4]  = '$';
        ascii[5]  = '%';
        ascii[6]  = '&';
        ascii[7]  = '\'';
        ascii[8]  = '(';
        ascii[9]  = ')';
        ascii[10] = '*';
        ascii[11] = '+';
        ascii[12] = ',';
        ascii[13] = '-';
        ascii[14] = '.';
        ascii[15] = '/';
        ascii[16] = '0';
        ascii[17] = '1';
        ascii[18] = '2';
        ascii[19] = '3';
        ascii[20] = '4';
        ascii[21] = '5';
        ascii[22] = '6';
        ascii[23] = '7';
        ascii[24] = '8';
        ascii[25] = '9';
        ascii[26] = ':';
        ascii[27] = ';';
        ascii[28] = '<';
        ascii[29] = '=';
        ascii[30] = '>';
        ascii[31] = '?';
        ascii[32] = '@';
        ascii[33] = 'A';
        ascii[34] = 'B';
        ascii[35] = 'C';
        ascii[36] = 'D';
        ascii[37] = 'E';
        ascii[38] = 'F';
        ascii[39] = 'G';
        ascii[40] = 'H';
        ascii[41] = 'I';
        ascii[42] = 'J';
        ascii[43] = 'K';
        ascii[44] = 'L';
        ascii[45] = 'M';
        ascii[46] = 'N';
        ascii[47] = 'O';
        ascii[48] = 'P';
        ascii[49] = 'Q';
        ascii[50] = 'R';
        ascii[51] = 'S';
        ascii[52] = 'T';
        ascii[53] = 'U';
        ascii[54] = 'V';
        ascii[55] = 'W';
        ascii[56] = 'X';
        ascii[57] = 'Y';
        ascii[58] = 'Z';
        ascii[59] = '[';
        ascii[60] = '\\';
        ascii[61] = ']';
        ascii[62] = '^';
        ascii[63] = '_';
        ascii[64] = '`';
        ascii[65] = 'a';
        ascii[66] = 'b';
        ascii[67] = 'c';
        ascii[68] = 'd';
        ascii[69] = 'e';
        ascii[70] = 'f';
        ascii[71] = 'g';
        ascii[72] = 'h';
        ascii[73] = 'i';
        ascii[74] = 'j';
        ascii[75] = 'k';
        ascii[76] = 'l';
        ascii[77] = 'm';
        ascii[78] = 'n';
        ascii[79] = 'o';
        ascii[80] = 'p';
        ascii[81] = 'q';
        ascii[82] = 'r';
        ascii[83] = 's';
        ascii[84] = 't';
        ascii[85] = 'u';
        ascii[86] = 'v';
        ascii[87] = 'w';
        ascii[88] = 'x';
        ascii[89] = 'y';
        ascii[90] = 'z';
        ascii[91] = '{';
        ascii[92] = '|';
        ascii[93] = '}';
        ascii[94] = '~';

        return ascii;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Boolean runAgain = true;
        int[] frequencies = new int[95];
        char[] ascii = createAscii();
        int choice = 1;
        String userInput;



        //Take the string input from the user
        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");
        userInput = scanner.nextLine();

        //Send userInput to a recordFrequencies to get the frequencies for each character
        frequencies = recordFrequencies(userInput, ascii);

        while (runAgain)
        {
            /**
             *  Get text from user
             *  Go to the printOptionsAndCatchErrors method to get the user's choice
             *  Carry out the choice that the user selects
             **/

            choice = printOptionsAndCatchErrors();

            //What to do based on user's choice
            if (choice == 1)
            {
                //Display the character frequencies alphabetically
                alphabeticalSort(ascii, frequencies);
            }
            else if (choice == 2)
            {
                //Display the sorted frequencies
                frequencySort(ascii, frequencies);
            }
            else if (choice == 3)
            {
                //Show types of character frequencies
                charTypes(frequencies);
            }
            else if (choice == 4)
            {
                //Exit sorter
                System.out.println("\nCharacter Sorter Exited Successfully");
                runAgain = false;
            }
        }


        return;
    }
}
