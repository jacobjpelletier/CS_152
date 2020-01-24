import java.io.*; //.File and .FileNotFoundException
import java.util.Scanner;

public class probFive
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("/Users/jacobpelletier/Desktop/CS152/data.text");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());
    }
}

