package Arrays;

import java.security.SecureRandom;

public class FoodQuality {

    public static void main(String[] args) {
        int[] ratingFrequency = new int[6];
        SecureRandom secureRandom = new SecureRandom();

        for(int i = 1; i <= 20; i++){
            ++ratingFrequency[1 + secureRandom.nextInt(5)];
        }
        System.out.printf("%s %7s%n","Rating", "Frequency");
        for(int rating = 1; rating < ratingFrequency.length; rating++){
            System.out.printf("%3d%10d%n", rating, ratingFrequency[rating]);
        }

    }
}
