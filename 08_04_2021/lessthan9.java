import java.io.*;
import java.util.*;
public class lessthan9
{
    public static void main(String[] args) throws IOException
    {
        HashSet<String> all = new HashSet<String>();
        HashSet<String> great = new HashSet<String>();
        BufferedReader br = new BufferedReader(new FileReader("all.txt"));
        String input;
        while ((input=br.readLine())!=null) all.add(input);
        br=new BufferedReader(new FileReader("great.txt"));
        while ((input=br.readLine())!=null) great.add(input);
        all.removeAll(great);
        System.out.print("students with less than 9 :\n");
        for (String s : all) System.out.println(s);
    }
}
