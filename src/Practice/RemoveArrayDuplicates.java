package Practice;

import java.util.Arrays;

public class RemoveArrayDuplicates {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,3,4,6};

        Arrays.sort(arr);
        int j=0;
        int n = arr.length-1;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++] = arr[n];

        for (int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
