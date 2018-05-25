package BeepBeepCipher;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ASCII {
    private static ArrayList<Integer> a = new ArrayList<>();
    
    public static void swap(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++){
            a.add(i, (int) arr.get(i).charAt(0));
        }
        for (int j = 0; j < a.size(); j++){
            System.out.print(a.get(j));
        }
    }
    public static void main(String[] args) {
        ArrayList<List<String>> listOfList = new ArrayList<List<String>>(0);
        System.out.println("Hello! Please input the string you would want changed below!");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.equals("")) {
            System.out.println("You must actually type something goofy head!");
        } else {
            List<String> list = Arrays.asList(input.split(""));
            ArrayList<String> n = new ArrayList<>(list);
            listOfList.add(list);
            swap(n);
        }
    }
}

