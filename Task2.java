import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while(values.size() != 3) {
                System.out.println("Input 3 numbers separated by commas (no negative numbers):");
                String input = scanner.nextLine();
                String[] stringValues = Arrays.stream(input.split(",")).map(String::trim).toArray(String[]::new);
                if(Arrays.stream(stringValues).allMatch(string -> string.chars().allMatch(Character::isDigit))){
                    values = Arrays.stream(stringValues).map(Integer::valueOf).collect(Collectors.toList());
                } else {
                    continue;
                }
                if(values.stream().anyMatch(value -> value < 0)){
                    values.clear();
                }
            }
        }
        for(int i = Collections.max(values); i > 0; i--) {
            for (Integer value : values) {
                if (value >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
