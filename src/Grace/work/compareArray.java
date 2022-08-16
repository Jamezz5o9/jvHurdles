package Grace.work;

import java.util.Objects;

public class compareArray {

    public static boolean arrayComparision(String[] first, String[] second){
        if(first == second){
            return true;
        }
        if(first == null || second == null){
            return false;
        }

        int check = first.length;
        if(check != second.length){
            return false;
        }

        for(int i = 0; i < check; i++){
            if(!Objects.equals(first[i], second[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] first = {"Favour", "Grace", "Kolade"};
        String[] second = {"Favou", "Grace", "Kolade"};
        if(arrayComparision(first, second)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }
    }
}
