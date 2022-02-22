package PatternPrograms;

public class SquarePattern {
    public static void main(String[] args) {
        int i,j,n;
        n=5;
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
