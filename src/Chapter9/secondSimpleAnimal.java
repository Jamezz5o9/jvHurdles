package Chapter9;

public class secondSimpleAnimal extends SimpleAnimal{
    private double animalSold;
    private int unitsOfAnimalSold;
    private final double workerSalary = 3000;




    public secondSimpleAnimal(String aves, String mammals, String annelida, String arthropoda, String eat, String play, String sleep, double animalSold, int unitsOfAnimalSold){
        super(aves, mammals, annelida, arthropoda, eat, play, sleep);

        if(animalSold < 0.0){
            throw new IllegalArgumentException("Animal sold should be > 0.0");
        }
        if(unitsOfAnimalSold < 1){
            throw new IllegalArgumentException("Units should be >= 1");
        }
        this.animalSold = animalSold;
        this.unitsOfAnimalSold = unitsOfAnimalSold;
    }

    public secondSimpleAnimal(double animalSold, int unitsOfAnimalSold){
        this.animalSold = animalSold;
        this.unitsOfAnimalSold = unitsOfAnimalSold;
    }
    public double getAnimalSold() {
        return animalSold;
    }

    public void setAnimalSold(double animalSold) {

        if(animalSold < 0.0){
            throw new IllegalArgumentException("Amount of animal sold should be > 0.0");
        }
        this.animalSold = animalSold;
    }

    public double calcMonthlySalary(){
      double interestPlusSalary =  unitsOfAnimalSold * animalSold;
      return interestPlusSalary + workerSalary;
    }


}
