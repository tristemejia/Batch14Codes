package class10;

public class ArrayReverseOrder {
    public static void main(String[] args) {
        /*
         * Create an array to store char values and
         * then print those in reverse order
         */
        char[] letters = { 'A', 'D', 'F'};
        for (int i = letters.length-1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}