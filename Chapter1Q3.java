public class CTCI {
    public static void main(String[] args){

        String stringA = "Mr John Smith";
        System.out.println(URLify(stringA));

    }
    static String URLify(String a){
        char[] content = a.toCharArray();
        int i;

        a = a.replace(" ","%20");
        return a;
	
    }
}

