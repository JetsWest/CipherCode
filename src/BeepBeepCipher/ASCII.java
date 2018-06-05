package BoopBoop;
import java.io.*;
import java.util.Base64;
import java.util.Scanner;

public class Base64Decode {
    private static FileOutputStream fos;
    private static PrintWriter pw;
    private static String encodedString;
    public static void decode(String encoded) throws UnsupportedEncodingException {
        byte[] encoder = Base64.getDecoder().decode(encoded);
        System.out.println(new String(encoder, "UTF-8"));
    }
    public static void encode(String str){
        encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedString);
    }
    public static void run() throws IOException {
        System.out.println("Welcome! Would you like to decode or encode today?");
        System.out.println("1) Decode");
        System.out.println("2) Encode");
        Scanner s = new Scanner(System.in);
        //String x = s.nextLine();
        String x = HelloApplet.x;
        if (x.equals("1")){
            System.out.println("Input a string - already in Base64 - below!");
            System.out.println("It will not output to a file. Why would you need to remember the decoded?");
            System.out.println("Just come back and do it again if ya need to :D");
            String c = s.nextLine();
            decode(c);
        }else if (x.equals("2")){
            System.out.println("Input a string below!");
            String p = s.nextLine();
            encode(p);
            File f = new File(p + ".txt");
            System.out.println("You can find this file in your IdeaProjects folder");
            FileOutput.print(encodedString, f);
        }else{
            System.out.println("THOT BE NIMBLE, THOT BE QUICK, BUT THOT DOES NOT HOW HOW TO USE BASE64 CLICK");
            run();
        }
        System.out.println("Run again? 1) Yes 2) No");
        int y = s.nextInt();
        if (y == 1){
            Main.run();
        }else if (y == 2){
            System.exit(0);
        }else{
            System.out.println("REEEEEEE! You do not get to run again after your goofy actions have killed thee.");
        }
    }
    public static void main(String[] args) throws IOException {
        run();
    }
}
