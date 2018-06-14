package BoopBoop;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Binary {
    private static String result = "";

    public static String getString(){
        return result;
    }
    public static String toBinary(String s) throws IOException {
        byte[] bytes = s.getBytes();

        StringBuilder binary = new StringBuilder();
        for (byte yoop : bytes) {
            int bonk = yoop;
            for (int i = 0; i < 8; i++) {
                binary.append((bonk & 128) == 0 ? 0 : 1);
                bonk <<= 1;
            }
        }
        File f = new File("H:\\IdeaProjects\\" + s + ".txt");
        System.out.println("You can find this file in your IdeaProjects folder");
        FileOutput.print(binary.toString(), f);
        System.out.println(binary.toString());
        result = binary.toString();
        return result;
    }

    public static String toText(String input) throws IOException {
        StringBuilder yeetbuilder = new StringBuilder();

        Arrays.stream(
                input.split("(?<=\\G.{8})")
        ).forEach(s ->
                yeetbuilder.append((char) Integer.parseInt(s, 2))
        );
        File f = new File("H:\\IdeaProjects\\" + input + ".txt");
        System.out.println("You can find this file in your IdeaProjects folder");
        FileOutput.print(yeetbuilder.toString(), f);
        System.out.println(yeetbuilder.toString());
        result = yeetbuilder.toString();
        return result;
    }

}