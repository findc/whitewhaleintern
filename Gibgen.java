/**
 * White Whale Internship Coding Challenge Solution.
 * Created by Calvin Findley.
 */

import java.util.Scanner;
import java.io.*;

public class Gibgen
{
    public static  void  main(String[] args)
    {
        try
        {
            BufferedReader inputStream = new BufferedReader(new FileReader("sample.txt"))
            String line = inputStream.readLine();
            System.out.println(line);
            inputStream.close();
        }
        catch(FileNotDoundException e)
        {
            System.out.println("The file was not found or could not be opened");
        }
        catch(IOException e)
        {
            System.out.println("Error reading from file");
        }
    }
}
