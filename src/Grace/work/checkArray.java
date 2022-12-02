package Grace.work;

import java.util.Arrays;
import java.util.Random;

public class checkArray {
    public static void main(String[] args) {
        shuffleArr();
//        int[] array = {45, 8, 50, 23, 32, 11, 90, 89, 34};
//        sortArr(array);
    }

    public static void sortArr(int[] array){

        int temp = 0;
        for(int i = 0; i < array.length; i++){
          for(int j = i + 1; j < array.length; j++){

              if(array[i] > array[j]){
                  temp = array[i];
                  array[i] =  array[j];
                  array[j] = temp;
              }

          }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void shuffleArr(){
        int[] array = {1, 2, 3, 4, 5, 6};

                Random rand = new Random();

                for(int i =0; i < array.length; i++){
                    int randomIndex = rand.nextInt(array.length);

                    int temp = array[randomIndex];

                    array[randomIndex] = array[i];

                    array[i] = temp;

                }
       System.out.println(Arrays.toString(array));
    }
}
