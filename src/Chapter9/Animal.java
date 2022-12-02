package Chapter9;

public class Animal {

    private String aves;
    private String mammals;
    private String annelida;
    private String arthropoda;

    private String eat;

    public Animal(String aves, String mammals, String annelida, String arthropoda, String eat){
        this.aves = aves;
        this.mammals = mammals;
        this.annelida = annelida;
        this.arthropoda = arthropoda;
        this.eat = eat;
    }
    public Animal(){};
    public Animal(String eat){
        this.eat = eat;
    }
    public Animal(String aves, String mammals){
        this.aves = aves;
        this.mammals = mammals;
    };

    public String getAves() {
        return aves;
    }

    public void setAves(String aves) {
        this.aves = aves;
    }

    public String getMammals() {
        return mammals;
    }

    public void setMammals(String mammals) {
        this.mammals = mammals;
    }

    public String getAnnelida() {
        return annelida;
    }

    public void setAnnelida(String annelida) {
        this.annelida = annelida;
    }

    public String getArthropoda() {
        return arthropoda;
    }

    public void setArthropoda(String arthropoda) {
        this.arthropoda = arthropoda;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s:  %s%n",
                "Subclass of aves is", aves,
                "Subclass of mammals is", mammals,
                "Subclass of annelids is", annelida,
                "Subclass of arthropods is", arthropoda,
                "What are you doing?", eat);
    }
}
