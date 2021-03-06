package BoopBoop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class RandomSwap {
    private static ArrayList<List<String>> listOfList = new ArrayList<>(0);
    private static FileOutputStream fos;
    private static PrintWriter pw;

    public static void swap(List<String> arr){
        for (int i = 0; i < arr.size(); i++){
            Collections.swap(arr, i, (int) (Math.random() * i));
        }
        String str = "";
        for (String string:arr){
            str += string;
        }
        System.out.println(str);
    }
    public static void decode(ArrayList<List<String>> arr){
        System.out.println("Which item would you like to decode from RANDOM SWAP? Input below!");
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        for (int i = 0; i < arr.get(j-1).size(); i++){
            System.out.print(arr.get(j-1).get(i));
        }
    }
    
    public static void run() throws IOException {
        System.out.println("Hello! Please input the string you would want changed below!");
        Scanner s = new Scanner(System.in);
        //String input = s.nextLine();
        String input = HelloApplet.x;
        if (input.equals("")){
            System.out.println("You must actually type something goofy head!");
        }else{
            List<String> list = Arrays.asList(input.split(""));
            List<String> n = new ArrayList<String>(list);
            listOfList.add(list);
            swap(n);
            File f = new File(input + ".txt");
            String x = String.join("", n);
            System.out.println("You can find this file in your IdeaProjects folder");
            FileOutput.print(x, f);
        }
        System.out.println("Would you like to run again?");
        System.out.println("1) Yes 2) No");
        int x = s.nextInt();
        if (x == 1){
            Main.run();
        }else if (x == 2){
            System.exit(0);
        }else{
            System.out.println("REEEEEEE! You do not get to run again after your goofy actions have killed thee.");
        }
    }
    public static void main(String[] args) throws IOException {
        run();
    }
}
