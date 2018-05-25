package BeepBeepCipher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello! Welcome to our encryption project! Choose an option below!");
        System.out.println("1) ASCII");
        System.out.println("2) Random Swap");
        System.out.println("3) Binary");
        System.out.println("4) QWERTY Swap");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch(choice){
            case 1:
                ASCII.run();
                break;
            case 2:
                RandomSwap.run();
                break;
            case 3:

            case 4:

        }
    }

}
