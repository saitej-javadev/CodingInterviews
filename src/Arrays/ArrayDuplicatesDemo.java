package Arrays;

import java.util.Arrays;

public class ArrayDuplicatesDemo {
    public static void main(String[] args) {
        int[] a = {2,2,3,4,4,5,5,6,6,7,8};

        int n= a.length-1;
        int j=0;
        for (int i=0;i<n;i++){
            if(a[i]!=a[i+1]){
               a[j]=a[i];
               j++;
            }
        }
        a[j] = a[n];
        j++;
        for (int i=0;i<j;i++){
            System.out.print(a[i]+" ");
        }

    }
}
