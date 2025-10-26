package entities;

public non-sealed class Aquatic extends Animal{
    private String habitat;


    public Aquatic(){}

    public Aquatic(String family, String name, int age, boolean isMammal , String habitat )  throws InvalidAgeException{
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public String toString(){
        return super.toString()+" habitat: "+habitat;
    }
}
