/**
 * White Whale Internship Coding Challenge Solution.
 * Created by Calvin Findley.
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Gibgen
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please Enter the Complete Filename of the Textfile You Would Like Transformed Into Gibberish: ");
        String fileName = reader.nextLine();
        String sentence = null;

        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            sentence = bufferedReader.readLine();
            bufferedReader.close();
        }

        catch (FileNotFoundException ex)
        {
            System.out.println("File '" + fileName + "' was not found");
            System.exit(0);
        }

        catch (IOException ex)
        {
            System.out.println("Error reading from '" + fileName + "'");
            System.exit(0);
        }

        preliminaryConversion(sentence);

    }


    public static void preliminaryConversion(String sentence)
    {
        System.out.println(sentence);
        String[] tokens = sentence.split("\\W"); //splits on any non-word character
        for (int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > 5)
            {
                scrambleToGibberish(tokens[i]);
            }
            else if(tokens[i].length() == 4)
            {
                manualGibberishFour(tokens[i]);
            }
            else if(tokens[i].length() == 5)
            {
                manualGibberishFive(tokens[i]);
            }
            else
            {

            }
        }
    }

    //Scrambles words larger than five
    public static void scrambleToGibberish(String word)
    {
        Random randomizer = new Random();
        char characters[] = word.toCharArray();

        for (int i = 1 ; i < characters.length - 2 ; i++)
        {
            int j = randomizer.nextInt(characters.length - 2) + 1;
            char temporary = characters[i];
            characters[i] = characters[j];
            characters[j] = temporary;
        }
        System.out.println(characters);
    }

    //Scrambles words with a length of four
    public static void manualGibberishFour(String word)
    {
        char characters[] = word.toCharArray();
        char temporary = characters[1];
        characters[1] = characters[2];
        characters[2] = temporary;
        System.out.println(characters);
    }

    //scrambles words with a lenght of five
    public static void manualGibberishFive(String word)
    {
        char characters[] = word.toCharArray();
        char temporary = characters[1];
        characters[1] = characters[3];
        characters[3] = temporary;
        System.out.println(characters);
    }

}
