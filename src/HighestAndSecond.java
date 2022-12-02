import java.util.Arrays;
import java.util.stream.IntStream;

public class HighestAndSecond {
    public static void main(String[] args) {
        int[] arr = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45};
        int[] secondArr = {1, 1, 3, 3, 4, 4, 4, 5, 6, 7, 8};
        int[]  checkThird = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int sum = 9;
//        twoSum(checkThird, sum);
//        check(arr);
        removeDuplicate(secondArr);
    }

    private static void twoSum(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++ ){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }

    private static void removeDuplicate(int[] arr) {
        int[] newArr = new int[arr.length];
        int temp = 0;
       for(int i = 0; i < arr.length; i++){
           for(int j = i + 1; j < arr.length; j++){
               if(arr[i] == arr[j] && arr[j] != temp){
                   newArr[i] = arr[i];
                   temp = arr[i];
                   newArr[arr.length - 1 ] = arr[arr.length - 1];
               }

           }
       }
        System.out.println(Arrays.toString(newArr));

    }

    private static void check(int[] arr){
        int max = arr[0];
        int secondMax = arr[0];
        for (int k : arr) {
            if (k > max) max = k;
        }
        for (int i : arr) {
            if (i > secondMax && i < max) secondMax = i;
        }

        System.out.println(max);
        System.out.println(secondMax);
    }

}
