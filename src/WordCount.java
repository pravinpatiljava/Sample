import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String args[]) {
        String s = "Pravin Patil Pravin Patil YES Patil Pravin";
        String remove="";
        String split[]=s.split(" ");

        for (String st: split)
        {
            if((remove.contains(st)))
            {
                System.out.println("Duplicate word is:" + st);
            }
            else
            {
                remove=remove+st+ " ";

            }
        }

        System.out.println(remove);
    }

}
