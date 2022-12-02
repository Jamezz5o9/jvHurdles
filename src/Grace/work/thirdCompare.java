package Grace.work;

import java.util.Objects;

public class thirdCompare {

    public static boolean checkNewArr(String[] initArr, String[] secondArr){
        String first = null;
        String second = null;
        boolean validation = false;
        for(int i = 0; i < initArr.length; i++){
            first += initArr;
        }

        for(int i = 0; i < secondArr.length; i++){
            second += secondArr;
        }

        if(!Objects.equals(second, first)){
            validation = true;
        }
    return validation;
    }

    public static void main(String[] args) {
        String[] initArr = {"Goke", "Lola", "Temi"};
        String[] secondArr = {"Ge", "Lola", "Temi"};

        if(checkNewArr(initArr, secondArr)){
            System.out.println("They are equal");
        } else{
            System.out.println("They are not equal");
        }
    }
}
