package designPattern.strategy;

public class Duck {
    private Quackable quackBehaviour;
    private Flyable flyBehaviour;

    public Duck(Quackable quackBehaviour, Flyable flyBehaviour) {
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public Quackable getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public Flyable getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }
}
