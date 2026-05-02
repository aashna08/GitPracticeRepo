import java.util.*;

public class StringFunctions {

    public void countOccurence(String str)
    {
        //Changes made for dev branch
        String st=str.toLowerCase();
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i=0;i<st.length();i++)
        {
            if(st.charAt(i)== ' ')
            {
                continue;
            }
            hm.put(st.charAt(i),hm.getOrDefault(st.charAt(i),0)+1);
        }
        System.out.println(hm);
    }


    public static void main(String[] args) {

    }
}
