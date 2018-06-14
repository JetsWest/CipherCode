package BoopBoop;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Vigenere {
    private HashMap<Character, Integer> charMap;
    private static String text = "";
    private final static char encryptionArrayThing[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public Vigenere(){
        charMap =  new HashMap<Character, Integer>();
        charMap.put('A', 0);
        charMap.put('B', 1);
        charMap.put('C', 2);
        charMap.put('D', 3);
        charMap.put('E', 4);
        charMap.put('F', 5);
        charMap.put('G', 6);
        charMap.put('H', 7);
        charMap.put('I', 8);
        charMap.put('J', 9);
        charMap.put('K', 10);
        charMap.put('L', 11);
        charMap.put('M', 12);
        charMap.put('N', 13);
        charMap.put('O', 14);
        charMap.put('P', 15);
        charMap.put('Q', 16);
        charMap.put('R', 17);
        charMap.put('S', 18);
        charMap.put('T', 19);
        charMap.put('U', 20);
        charMap.put('V', 21);
        charMap.put('W', 22);
        charMap.put('X', 23);
        charMap.put('Y', 24);
        charMap.put('Z', 25);
    }
    public static String getString(){
        return text;
    }
    public String encrypt(String plainText, String key) throws IOException {
        String encryptedText = "";

        if(plainText.length() <= 0 || key.length() <= 0){
            return null;
        }
        plainText = plainText.trim();
        plainText = plainText.replaceAll("\\W", "");
        key = key.trim();
        if(plainText.contains(" ") || key.contains(" ")) {
            plainText = plainText.replaceAll(" ", "");
            key = key.replaceAll(" ", "");
        }
        plainText = plainText.toUpperCase();
        key = key.toUpperCase();
        for(int i = 0; i < plainText.length(); i++){
            char letter = plainText.charAt(i);
            char keyLetter = key.charAt((i % key.length()));
            int lookUp = (charMap.get(letter) + charMap.get(keyLetter)) % 26;
            encryptedText += encryptionArrayThing[lookUp];
        }
        text = encryptedText;
        System.out.println(text);
        File f = new File("H:\\IdeaProjects\\" + plainText + ".txt");
        System.out.println("You can find this file in your IdeaProjects folder");
        FileOutput.print(text, f);
        return text;
    }

    public String decrypt(String cipherText, String key) throws IOException {
        String plainText = "";
        if(cipherText.length() <= 0 || key.length() <= 0){
            return null;
        }
        cipherText = cipherText.trim();
        cipherText = cipherText.replaceAll("\\W", "");
        key = key.trim();
        if(cipherText.contains(" ") || key.contains(" ")){
            cipherText = cipherText.replaceAll(" ", "");
            key = key.replaceAll(" ", "");
        }
        cipherText = cipherText.toUpperCase();
        key = key.toUpperCase();
        for(int i = 0; i < cipherText.length(); i++){
            char letter = cipherText.charAt(i);
            char keyLetter = key.charAt((i % key.length()));
            int lookUp = (charMap.get(letter) - charMap.get(keyLetter)) % 26;
            if (lookUp < 0){
                lookUp += 26;
            }
            plainText += encryptionArrayThing[lookUp];
        }
        text = plainText;
        System.out.println(text);
        File f = new File("H:\\IdeaProjects\\" + cipherText + ".txt");
        System.out.println("You can find this file in your IdeaProjects folder");
        FileOutput.print(text, f);
        return text;
    }
}