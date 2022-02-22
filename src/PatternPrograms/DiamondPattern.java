package PatternPrograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++) {               // for increasing portion
            for(int j = i; j<=n; j++) {        // print space
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++) {  // print star
                System.out.print("*");
            }
            System.out.println();             // new line
        }

        // for decrement portion
        for(int i=n-1; i >=1; i--) {
            // print space
            for(int j=n; j >= i; j--) {
                System.out.print(" ");
            }
            // print star
            for(int k=1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }

}
