import java.util.Scanner;

public class userInput {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       // collectInput();
        highAndLow();
        //highestAndLow();
    }

    public static void collectInput(){
        int largest = 0;
        int lowest = 1_000_000_000;

        for(int i = 1; i <= 5; i++){
            System.out.printf("Enter number %d%n", i);
            int num = input.nextInt();
            if(num > largest){
                largest = num;
            } else if(num < lowest){
                lowest = num;
            }
        }

        System.out.printf("The largest num is %d%nThe lowest number is %d%n", largest, lowest);
    }

    public static void highAndLow(){

        System.out.println("Enter number 1");
        int user_input = input.nextInt();
        int lowest_number = user_input;
        int highest_number = user_input;
        int count = 1;

        while(count < 5){
            System.out.printf("Enter Number %d%n", count + 1);
            user_input = input.nextInt();
            boolean user_input_is_larger = user_input > highest_number;
            boolean user_input_is_lower = user_input < lowest_number;
            if(user_input_is_larger){
                highest_number = user_input;
            }
            if (user_input_is_lower) {
                lowest_number = user_input;
            }

            count = count + 1;
        }

        System.out.printf("The highest number is %d%nThe lowest number is %d%n", highest_number, lowest_number);
    }

    public static void highestAndLow(){
        System.out.println("Enter number 1");
        int number = input.nextInt();
        int largestNum = number;
        int lowestNum = number;

      for(int i = 2; i <= 5; i++){
          System.out.printf("Enter number %d%n", i);
          number = input.nextInt();
          if(number > largestNum){
              largestNum = number;
          } else if (number < lowestNum) {
              lowestNum = number;
          }
      }
        System.out.printf("The highest number is %d%nThe lowest is %d%n", largestNum, lowestNum);
    }
    public static void secondHighestInput(){

    }
}
