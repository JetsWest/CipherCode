import java.util.*;

public class RandomSwap {
    private static ArrayList<List<String>> listOfList = new ArrayList<>(0);

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
    public static void run(){
        System.out.println("Hello! Please input the string you would want changed below!");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        if (input.equals("")){
            System.out.println("You must actually type something goofy head!");
        }else{
            List<String> list = Arrays.asList(input.split(""));
            List<String> n = new ArrayList<String>(list);
            listOfList.add(list);
            swap(n);
        }
    }
    public static void main(String[] args){
        run();
    }
}
