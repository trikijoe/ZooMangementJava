package entities;

public sealed class Animal permits Aquatic , Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // getters
    public String getFamily(){return family;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public boolean isMammal(){return isMammal;}
    //setter
    public void setFamily(String f){this.family=f;}
    public void setName(String n){this.name=n;}
    public void setAge(int a){
        if (a<0){System.out.println("Error: Age cannot be negative");}
        else{this.age=a;}
    }
    public void setMammal(boolean m){this.isMammal=m;}


    public  Animal(){}

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString(){
        return "entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}' ;
    }


}
