import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class CTCI {
    public static void main(String[] args){

        String stringA = "abc";
        String stringB = "cba";
        System.out.println(checkPerm(stringA, stringB));

    }
    static boolean checkPerm(String a, String b){
        Hashtable<Character, Integer> ht1 = new Hashtable<>();
        for (int i = 0; i < a.length(); i++ ){
            ht1.put(a.charAt(i),1);
            ht1.put(b.charAt(i),1);
        }
        System.out.print(ht1);
        return true;
    }
}

