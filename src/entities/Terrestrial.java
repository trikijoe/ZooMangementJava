package entities;

public  non-sealed class Terrestrial extends Animal{
    private String nbrLegs;


    public Terrestrial(){}

    public Terrestrial(String family, String name, int age, boolean isMammal , String nbrLegs )  throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString(){
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }
}
