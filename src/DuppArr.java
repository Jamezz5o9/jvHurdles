import java.util.Arrays;

public class DuppArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 6, 7};
        int length = arr.length;
        removeDuplicate(arr, length);
    }

    public static void removeDuplicate(int[] arr, int n){
        int j = 0;
        int[] temp = new int[n];
        for(int i = 0; i < n - 1; i++){
            if(arr[i] != arr[i + 1]){
                temp[j++] = arr[i];
            }
        }
        temp[j] = arr[n-1];
        System.out.println(Arrays.toString(temp));
    }
}
