package Chapter9;

public class thirdSimpleAnimal extends secondSimpleAnimal{
    private String amphibians;

    public thirdSimpleAnimal(String aves, String mammals, String annelida, String arthropoda, String eat, String play, String sleep, double animalSold, int unitsOfAnimalSold, String amphibians){
        super(aves, mammals, annelida, arthropoda, eat, play, sleep, animalSold, unitsOfAnimalSold);

        this.amphibians = amphibians;
    }

    public String getAmphibians() {
        return amphibians;
    }

    public void setAmphibians(String amphibians) {
        this.amphibians = amphibians;
    }

}
