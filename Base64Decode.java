package BoopBoop;

import AppletPackage.HelloApplet;

import java.io.*;
import java.util.Base64;
import java.util.Scanner;

public class Base64Decode {
    private static FileOutputStream fos;
    private static PrintWriter pw;
    private static String encodedString;
    private static String peep;

    public static void setString(String str){
        peep = str;
    }
    public static void decode(String encoded) throws UnsupportedEncodingException {
        byte[] encoder = Base64.getDecoder().decode(encoded);
        System.out.println(new String(encoder, "UTF-8"));
    }

    public static void encode(String str) {
        encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedString);
    }

    public static void run() throws IOException {
        System.out.println("Welcome! Would you like to decode or encode today?");
        System.out.println("1) Decode");
        System.out.println("2) Encode");
        String x = HelloApplet.x;
        if (peep.equals("1")) {
            System.out.println("Input a string - already in Base64 - below!");
            decode(x);
            File f = new File("H:\\IdeaProjects\\" + x + ".txt");
            System.out.println("You can find this file in your IdeaProjects folder");
            FileOutput.print(encodedString, f);
        } else if (peep.equals("2")) {
            System.out.println("Input a string below!");
            encode(x);
            File f = new File("H:\\IdeaProjects\\" + x + ".txt");
            System.out.println("You can find this file in your IdeaProjects folder");
            FileOutput.print(encodedString, f);
        } else {
            System.out.println("THOT BE NIMBLE, THOT BE QUICK, BUT THOT DOES NOT HOW HOW TO USE BASE64 CLICK");
        }
    }

    public static void main(String[] args) throws IOException {
        run();
    }
}