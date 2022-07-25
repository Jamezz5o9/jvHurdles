import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class checkPrice {
    public static void main(String[] args) {
        output();
    }
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> items = new ArrayList<>();
    private static ArrayList<Integer> units = new ArrayList<>();
    private static ArrayList<Integer> unitPrice = new ArrayList<>();
    private static String addInput;
    private static String goods;
    private static int unit;
    private static int price;
    private static final double salary = 200;
    private static final double interestPerWeek = 0.09;

    public static void weeklySalary(){
        do{
            System.out.println("Please add item that you wanna purchase");
            goods = input.nextLine();
            items.add(goods);

            System.out.println("Enter the price per goods bought");
            price = input.nextInt();
            unitPrice.add(price);

            System.out.println("Add units you wanna buy");
            unit = input.nextInt();
            units.add(unit);

            input.nextLine();
            System.out.println("Add more items (Y | N) ");
            addInput = input.nextLine();



    }while(!Objects.equals(addInput, "N"));
    }

    public static void checkPrice(){

        double totalCost = 0;
        double soldItemCost = 0;
        for(int i = 0; i < items.size(); i++){
            soldItemCost = unitPrice.get(i) * units.get(i);
        }
        for(int i = 0; i < items.size(); i++ ){
            totalCost += unitPrice.get(i) * units.get(i);;
        }
        double amountSold = totalCost * interestPerWeek;
        double salaryPerWeek =  amountSold + salary;

        System.out.printf("Your salary for this week is %.2f", salaryPerWeek);
    }


    public static void output(){
        weeklySalary();
        checkPrice();
    }
}
