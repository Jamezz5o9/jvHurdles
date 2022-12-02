package Grace.work;

import java.util.Scanner;

public class playingAroung {


    public static void newInput(String newValue) throws IllegalAccessException {

        char[] fill  = newValue.toCharArray();

        if(fill[fill.length - 1] == '0'){
            System.out.println(" ");
            return;
        }
        if(newValue.length() > 8){
            newValue = newValue.substring(0, 8);
        }

        for(char i : fill){
            if(!(i == '1' || i == '0')){
                throw new IllegalAccessException("Only 0's and 1's are allowed");
            }
        }
        for(int i = 0; i < newValue.length(); i++){
            if (newValue.charAt(i) == '1') {
                switch (i){

                }


            }
        }

    }
}
