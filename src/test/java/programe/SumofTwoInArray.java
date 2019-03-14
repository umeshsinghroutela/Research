package programe;

public class SumofTwoInArray {

    // in arr[0..n-1]
    static void maxProduct(int arr[], int n) {
        if (n < 2) {
            System.out.println("No pairs exists");
            return;
        }

        // Initialize max product pair
        int a = arr[0], b = arr[1];

        // Traverse through every possible pair
        // and keep track of max product
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
//                if (arr[i] == arr[j]){
//                    a = arr[i];
//                    b = arr[j];
//                }
                if (arr[i] + arr[j] > a + b) {
                    a = arr[i];
                    b = arr[j];
                }

        System.out.println("Max product pair is {" +
                a + ", " + b + "}");
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {10,1, 4, 3, 6, 7, 0,-9};
        int n = arr.length;
        maxProduct(arr, n);

    }
}

