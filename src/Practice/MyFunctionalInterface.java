package Practice;
@FunctionalInterface
public interface MyFunctionalInterface {
    int product(int x,int y);
}
class Test  {
    public static void main(String[] args) {
      MyFunctionalInterface fi = ( x,y)->x*y;
        System.out.println(fi.product(6,7));
    }
}