package cipher; 
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void run() throws IOException{
        System.out.println("Hello! Welcome to our encryption project! Choose an option below!");
        System.out.println("1) Base64");
        System.out.println("2) Random Swap");
        System.out.println("3) Binary");
        System.out.println("4) QWERTY Swap");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Choose an item below!");
                Base64Decode.run();
                break;
            case 2:
                System.out.println("You can only decode after you have decoded one or more items. This is because it is RANDOM and you cannot easily undo it.");
                RandomSwap.run();
                break;
            case 3:

            case 4:
                    
            default:
                System.out.println("HEY BROTHER YOU REEEE!");
            break;
        }
    }
    public static void main(String[] args) throws IOException {
        run();
    }

}
