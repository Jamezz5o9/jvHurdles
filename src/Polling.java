import java.util.Scanner;

public class Polling {
    private static int[][] response;
    private static String[] issues;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        pollResponse();

    }

    private static void pollResponse() {
        String[] issues = {"Financial", "Marital", "Academic", "Sexual", "Environmental"};
        response = new int[5][10];

        for(int i = 0; i < issues.length; i++){
            System.out.println(issues[i]);
        }

        for(int i = 0; i < response.length; i++){
            for(int j = 0; j < response[i].length; j++){

            }
        }


        responseStore();
    }

    private static void responseStore() {
        String[] issues = {"Financial", "Marital", "Academic", "Sexual", "Environmental"};
        response = new int[5][10];

    }


}
