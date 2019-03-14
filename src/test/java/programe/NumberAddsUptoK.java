package programe;

import java.util.HashSet;

public class NumberAddsUptoK {
    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {10, 1,0,0, -4, 3, 6, 7, 0, -9};
        int k =-13;
//        NumberAddsUptoK(arr, k);
//        anotherway(arr,k);
        StringBuilder s = new StringBuilder("Hello");
        System.out.println( s.reverse());
    }

    // in arr[0..n-1]
    static void NumberAddsUptoK(int[] arr, int k) {

        // Initialize max product pair
        int a = 0, b = 0;
        boolean flag = false;

        // Traverse through every possible pair
        // and keep track of max product
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    a = arr[i];
                    b = arr[j];
                    flag = true;
                }
            }
        }

       if(!flag){
            System.out.println("No pair found");
            return;
        }

        System.out.println("two number sume is equal to  " + k + " is {" + a + ", " + b + "}");
    }


    public static void anotherway(int[] ar, int k){
        boolean flag=false;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<ar.length;i++){
            if(hashSet.contains(k-ar[i]))flag=true;
            hashSet.add(ar[i]);
        }
        if(flag)
            System.out.println("YES PRESENT");
        else
            System.out.println("NOT PRESENT");
    }


}
