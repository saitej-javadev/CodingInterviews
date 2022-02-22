package PatternPrograms;

public class RightAngledReverse {
    public static void main(String[] args) {
        int i,j,n;
        n=5;
        for(i=1;i<=n;i++){
            for (j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
