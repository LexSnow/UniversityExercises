import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Write a program reading integers until zero is entered and printing the length of the
        longest sequence of consecutive numbers of the same value (and this value).*/
        System.out.println("Input numbers: ");
        Scanner scanner = new Scanner(System.in);
        int input;
        int lastInput = 0;
        int longestInput = 0;
        int length = 0;
        int longestLength = 0;
        do{
            input = scanner.nextInt();
            if(input != lastInput){
                lastInput = input;
                length = 1;
            } else {
                length++;
                if (longestLength < length) {
                    longestLength = length;
                    longestInput = input;
                }
            }
        } while (input != 0);
        System.out.println("Longest sequence: " + longestLength + " times " + longestInput);
    }
}