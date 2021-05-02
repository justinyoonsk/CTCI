import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class CTCI {
    public static void main(String[] args){

        String stringA = "awegoi";
        System.out.println(isUnique(stringA));

    }
    static boolean isUnique(String a){
        boolean[] char_set = new boolean[128];
        int counter = 0;
        Hashtable<Character, Integer> ht1 = new Hashtable<Character, Integer>();
        for (int i = 0; i <a.length(); i++) {
            if(!ht1.keySet().contains(a.charAt(i))){
                ht1.put(a.charAt(i),i);
            }
            else{
                return(false);
            }

            /*int c = a.charAt(i);
            if (char_set[c]){
                return false;
            }
            char_set[c] = true;
            if (ht1.containsKey(c)) {
                return (false);
            } else {
                return (true);
            }*/
        }
        return true;
    }
}
