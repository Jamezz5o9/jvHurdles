import java.util.Arrays;

public class NewJava {
    public static void main(String[] args) {
       // letCheck();
        arrayHundred();
    }


    public static void letCheck(){
        int[] f = {0, 1 , 2, 3, 4, 5, 6};
        int j = 0;
        int k = 0;
        for(int i = 0; i < f.length; i++){
            j = f.length - 1;
            k = f[2];
        }
        System.out.println(j);
        System.out.println(k);
    }

    public static void letCheckEight(){
        int[] g = new int[5];

        g[0] = 8;
        g[1] = 8;
        g[2] = 8;
        g[3] = 8;
        g[4] = 8;

    }

    public static void arrayHundred(){
        float[] array = new float[100];
        float total = 0;

        for(int i = 0; i < array.length; i++){
                total += i;
        }
        System.out.println(total);
    }

    public static void arrayCopy(){
        int[] a = {11, 21, 3, 7, 0, 8, 10, 19, 18, 34, 57};
        int[] b = new int[34];

        //Arrays.copyOfRange(a, 0, 10);
        Arrays.stream(a).findAny();

//        for(int i = 0; i < a.length; i++){
//            int first = 0;
//            if(first <= a[5]){
//                sy
//         }
//        }
    }
}
