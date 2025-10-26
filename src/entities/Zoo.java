package entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    static final int NUMBER_OF_AQUATIC_ANIMAL = 10;
    private Animal[] animals;
    private Aquatic[] aquatics;
    private String name , city;
    private int nbrAnimals;
    private int nbrAquatics;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals=new Animal[NUMBER_OF_CAGES];
        aquatics= new Aquatic[NUMBER_OF_AQUATIC_ANIMAL];
        this.name = name;
        this.city = city;


    }
    //getters
    public String getName() {return name;}
    public String getCity() {return city;}
    public int getNbrAnimals() {return nbrAnimals;}
    public int getNbrAquatics() {return nbrAquatics;}

    public Aquatic[] getAquatics() {return aquatics;}

    //setters
    public void setCity(String city) {this.city = city;}
    public void setName(String name) {this.name = name;}
    public void setNbrAnimals(int n) {this.nbrAnimals = n;}
    public void setNbrAquatics(int n) {this.nbrAquatics = n;}
    public void setAquatics(Aquatic[] a) {this.aquatics = a;}




    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: ");
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == animal) {
                return i;
            }
        }
        return -1;
    }


    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            return false;
        }
        if(isZooFull()){
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public Boolean isZooFull() {
        return nbrAnimals==NUMBER_OF_CAGES;
    }

    public Zoo comparerZoo(Zoo z1 ,  Zoo z2) {
        if (z1.nbrAnimals>z2.nbrAnimals) {
            return z1;
        }
            return z2;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquatics[nbrAquatics]=aquatic;
        nbrAquatics++;
    }
    public float maxPenguinSwimmingDepth() {
        float maxPenguinSwimmingDepth = 0f;
        for (int i=0 ; i<nbrAquatics ; i++){
            if (aquatics[i]instanceof Penguin penguin){
                if (penguin.getSwimmingDepth() > maxPenguinSwimmingDepth){
                    maxPenguinSwimmingDepth=penguin.getSwimmingDepth();
                }
            }
        }
        return maxPenguinSwimmingDepth;
    }

    public void displayNumberOfAquaticByType(){
        int nbrPenguin  = 0;
        int nbrDolpin =0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquatics[i] instanceof Penguin penguin) {
                nbrPenguin++;
            }
            if (aquatics[i] instanceof Dolphin dolphin) {
                nbrDolpin++;
            }
        }
        System.out.println("nbr de penguin " + nbrPenguin + "nbr de dolphin" + nbrDolpin);
    }
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals:  " +  nbrAnimals + " nbr animal ";
    }
}