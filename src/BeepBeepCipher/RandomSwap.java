package BeepBeepCipher;

import java.util.Collections;
import java.util.ArrayList;

public class RandomSwap {
    private ArrayList<String> str;

    public RandomSwap(String string){
        for (String s:string.split("")){
            str.add(s);
        }
    }
    public static void swap(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++){
            Collections.swap(arr, i, (int) (Math.random() * i));
        }
    }
    public static void main(String[] args){
        RandomSwap r = new RandomSwap("I finna do it to em");

    }
}
