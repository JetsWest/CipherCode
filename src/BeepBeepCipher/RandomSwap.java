package BeepBeepCipher;

import java.util.*;

public class RandomSwap {

    public static void swap(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++){
            Collections.swap(arr, i, (int) (Math.random() * i));
        }
    }
    public static void main(String[] args){
        ArrayList<List<String>> listOfList = new ArrayList<List<String>>(0);
        System.out.println("Hello! Please input the string you would want changed below!");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.equals("")){
            System.out.println("You must actually type something goofy head!");
        }else{
            List<String> list = Arrays.asList(input.split(""));
            ArrayList<String> n = new ArrayList<>(list);
            listOfList.add(list);
            swap(n);
            String str = "";
            for (String string:n){
                str += string;
            }
            System.out.println(str);
            System.out.println(Arrays.asList(listOfList));
        }
    }
}