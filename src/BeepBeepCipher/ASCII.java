import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Scanner;

public class Base64Decode {
    public static void decode(String encoded) throws UnsupportedEncodingException {
        byte[] encodedString = Base64.getDecoder().decode(encoded);
        System.out.println(new String(encodedString, "UTF-8"));
    }
    public static void encode(String str){
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedString);
    }
    public static void run() throws UnsupportedEncodingException {
        System.out.println("Welcome! Would you like to decode or encode today?");
        System.out.println("1) Decode");
        System.out.println("2) Encode");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if (x == 1){
            System.out.println("Input a string - already in Base64 - below!");
            String c = s.nextLine();
            decode(c);
        }else if (x == 2){
            System.out.println("Input a string below!");
            String p = s.nextLine();
            encode(p);
        }else{
            System.out.println("THOT BE NIMBLE, THOT BE QUICK, BUT THOT DOES NOT HOW HOW TO USE BASE64 CLICK");
        }
    }
    public static void main(String[] args)throws IOException {
        run();
    }
}
