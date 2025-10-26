package entities;

public  class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin() {}

    public  Dolphin(String family, String name, int age, boolean isMammal , String habitat , float swimmingSpeed)throws InvalidAgeException{
        super( family,  name,  age,  isMammal ,  habitat);
        this.swimmingSpeed = swimmingSpeed;

    }
    //getter
    public float getSwimmingSpeed() {return swimmingSpeed;}
    //setter
    public void setSwimmingSpeed(float swimmingSpeed) {}
    @Override
    public void swim(){
        System.out.println("dolphin is Swimming ");
    }

    @Override
    public String toString(){
        return super.toString()+ " swimmingSpeed "+ swimmingSpeed ;
    }
}



