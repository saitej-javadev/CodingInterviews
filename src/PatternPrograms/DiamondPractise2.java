package PatternPrograms;

public class DiamondPractise2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//row
            for (int j = 5; j >= i; j--) {
                System.out.print(" "); // prints space
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");// prints *
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {//row
            for (int j = 5; j >= i; j--) {
                System.out.print(" "); // prints space
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");// prints *
            }
            System.out.println();
        }
    }
}
