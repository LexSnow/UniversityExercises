import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a1;
        int a2;
        int b1;
        int b2;
        int input;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Input 2 integers for interval A");
            a1 = scanner.nextInt();
            a2 = scanner.nextInt();
            System.out.println("Input 2 integers for interval B");
            b1 = scanner.nextInt();
            b2 = scanner.nextInt();
            System.out.println("Input an integer");
            input = scanner.nextInt();
        }
        System.out.println("Interval A = [" + a1 +", " + a2 + "]");
        System.out.println("Interval B = [" + b1 +", " + b2 + "]");
        System.out.println("Enter x " + input);
        boolean inA = input >= a1 && input <= a2;
        boolean inB = input >= b1 && input <= b2;
        boolean setA = inA && !(inB);
        boolean setB = !(inA) && inB;
        boolean interAB = inA && inB;
        boolean unionAB = inA || inB;
        boolean symmDiffAB = setA || setB;
        final Object[][] table = new String[7][];
        table[0] = new String[] {
                "x in A:",
                String.valueOf(inA)
        };
        table[1] = new String[] {
                "x in B:",
                String.valueOf(inB)
        };
        table[2] = new String[] {
                "x in A\\B:",
                String.valueOf(setA)
        };
        table[3] = new String[] {
                "x in B\\A:",
                String.valueOf(setB)
        };
        table[4] = new String[] {
                "x in intersection of A and B:",
                String.valueOf(interAB)
        };
        table[5] = new String[] {
                "x in union of A and B:",
                String.valueOf(unionAB)
        };
        table[6] = new  String[] {
                "x in symm. diff. of A and B:",
                String.valueOf(symmDiffAB)
        };
        for(final Object[] row: table){
            System.out.format("%-30s%5s%n", row);
        }
    }
}