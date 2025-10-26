package entities;

public class Penguin extends Aquatic {
    private float swimmingDepth ;



    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal , String habitat ,  float swimmingSpeed)  throws InvalidAgeException{
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingSpeed;
    }
    //getter
    public float getSwimmingDepth() {return swimmingDepth;}
    //setter
    public void setSwimmingDepth(float swimmingDepth) {this.swimmingDepth = swimmingDepth;}
    @Override
    public void swim() {
        System.out.println("Penguin is Swimming");
    }
    @Override
    public String toString(){
        return super.toString()+ " swimmingDepth "+ swimmingDepth ;
    }
}
