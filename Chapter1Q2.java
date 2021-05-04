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
        if (a.length() != b.length()){
            return false;
        }
        return sort(a).equals(sort(b));

    }
    static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}

