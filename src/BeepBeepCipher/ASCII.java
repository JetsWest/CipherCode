package BeepBeepCipher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ASCII {
    private static ArrayList<Integer> a = new ArrayList<>();

    public static void swap(List<String> arr){
        for (int i = 0; i < arr.size(); i++){
            a.add(i, (int) arr.get(i).charAt(0));
        }
        for (int j = 0; j < a.size(); j++){
            System.out.print(a.get(j));
        }
    }

    public static void decode(ArrayList<List<Integer>> arr){
        System.out.println("Which item would you like to decode from ASCII DECODER? Input below!");
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        if (j-1 < 0 || j-1 > arr.size()){
            System.out.println("BOY! IN THE ARRAY YA GOOF HEAD!");
        }
        for (int i = 0; i < arr.get(j-1).size(); i++){
            int number = arr.get(j-1).get(i);
            System.out.print(Character.toString((char) number));
        }
    }

    public static void run() throws IOException {
        ArrayList<List<Integer>> listOfList = new ArrayList<List<Integer>>(0);
        System.out.println("Hello! Please input the string you would want changed below!");
        System.out.println("Your information can be found at: C:\\Users\\Jackson Atkins\\IdeaProjects\\CipherCode");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.equals("")) {
            System.out.println("You must actually type something goofy head!");
        } else {
            List<String> list = Arrays.asList(input.split(""));
            swap(list);
            listOfList.add(a);
        }
    }

    public static void main(String[] args)throws IOException {
        run();
    }
}


