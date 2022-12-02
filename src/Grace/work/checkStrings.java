package Grace.work;

import java.util.Objects;

public class checkStrings {
    public static boolean checkArrayEquality(String[] firstArr, String[] secondArr){
        if(firstArr == secondArr){
            return true;
        }
        if(firstArr == null || secondArr == null){
            return false;
        }
        int check = firstArr.length;
        if(check != secondArr.length){
            return false;
        }

        for(int i = 0; i < check; i++){
            if(!Objects.equals(firstArr[i], secondArr[i])){
                return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        String[] firstArr = {"James", "Lemi", "Titi"};
        String[] secondArr = {"James", "kemi", "Titi"};

        if(checkArrayEquality(firstArr, secondArr)){
            System.out.println("They are equal");
        } else{
            System.out.println("They are not equal");
        }
    }
}
