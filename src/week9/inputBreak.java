package week9;

import java.util.Scanner;

public class inputBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int count = 1;

        System.out.println("Input number");
        int num = input.nextInt();

        if(num == 1){
            System.out.println(0);
        }
        if(num == 0){
            System.out.println(1);
        }

    }
}
