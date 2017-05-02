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
        }

        catch (IOException ex)
        {
            System.out.println("Error reading from '" + fileName + "'");
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

            }
            else if(tokens[i].length() == 4)
            {

            }
            else if(tokens[i].length() == 5)
            {

            }
            else
            {

            }
        }
    }



}
