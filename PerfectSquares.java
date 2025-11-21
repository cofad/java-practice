
// Return - The number of elements who have an integer square root and the last element that has an integer root
// Anser 3, 16

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 1, 2, 9, 16 };
        int count = 0;
        int last = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPerfectSquare(array[i])) {
                last = array[i];
                count++;
            }
        }

        System.out.println(count);
        System.out.println(last);
    }

    public static boolean isPerfectSquare(int n) {
        long sqrt = Math.round(Math.sqrt(n));
        return sqrt * sqrt == n;
    }
}