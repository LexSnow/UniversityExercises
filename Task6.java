public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            int col = (int) (Math.random() * (5 - 1) + 1);
            int rnk = (int) (Math.random() * (15 - 2) + 2);

            String color = switch (col) {
                case 1 -> "Hearts";
                case 2 -> "Diamonds";
                case 3 -> "Spades";
                case 4 -> "Clubs";
                default -> throw new IllegalStateException("Unexpected value: " + col);
            };
            String rank = switch (rnk) {
                case 2 -> "Deuce";
                case 3 -> "Trey";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 14 -> "Ace";
                default -> throw new IllegalStateException("Unexpected value: " + col);
            };
            System.out.println(rank + " of " + color);
        }
    }
}