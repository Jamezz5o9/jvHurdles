package designPattern.strategy;

import org.junit.jupiter.api.Test;

public class DuckTest {

    @Test
    public void fanTest() {
        Fly1 fly1 = new Fly1();
        Fly2 fly2 = new Fly2();

        Quack1 quack1 = new Quack1();
        Quack2 quack2 = new Quack2();

        Duck pepeye = new Duck(quack2, fly1);

        pepeye.fly();
        pepeye.setFlyBehaviour(fly2);
        pepeye.fly();

        Card card = new Card(){
            @Override
            public void shuffle(){
                System.out.println("I am shuffling");
            }
        };
        card.shuffle();
    }
}
