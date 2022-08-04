package Chapter9;

public class SimpleAnimal extends  Animal{
    private String play;
    private String sleep;

    public SimpleAnimal(String aves, String mammals, String annelida, String arthropoda, String eat, String play, String sleep){
        super(aves, mammals, annelida, arthropoda, eat);

        this.play = play;
        this.sleep = sleep;
    }
    public SimpleAnimal(){};
    public SimpleAnimal(String play, String sleep){
        this.play = play;
        this.sleep = sleep;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String toString(){
        return String.format("%s: %s%n%s: %s%n", "James", sleep, "Bolaji", play);
    }
}
