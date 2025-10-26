package main;
import entities.*;
public class Main {

    public static void main(String[] args) {
        /*entities.ZooManagement zm= new entities.ZooManagement();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the zoo: ");
        String zooName = sc.nextLine();

        System.out.println("Enter the number of cages: ");
        int nbrZooCages = sc.nextInt();

        zm.nbrCages=nbrZooCages;
        zm.zooName=zooName;

        zm.displayInformation();*/

        Animal dog = new Animal("canine", "max" , 3 ,  true);
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        Animal dog3 = new Animal("Canine", "lll", 2, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

        System.out.println(myZoo.toString());

        System.out.println(dog.toString());

        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.addAnimal(dog3);

        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(dog3);
        System.out.println(index);

        System.out.println(myZoo.comparerZoo(myZoo , notMyZoo));

        Penguin myPenguin = new Penguin("canine" , "triki" , 3 , true , "antartic" , 5.34f);
        Penguin myPenguin1 = new Penguin("canine" , "triki" , 3 , true , "antartic" , 52.34f);
        Penguin myPenguin2 = new Penguin("canine" , "triki" , 3 , true , "antartic" , 522.34f);
        Penguin myPenguin3 = new Penguin("canine" , "triki" , 3 , true , "antartic" , 5222.34f);
        Penguin myPenguin4= new Penguin("canine" , "triki" , 3 , true , "antartic" , 52222.34f);



        Dolphin myDolphin = new Dolphin("canine" , "omar" , 4 , false , "ocean" , 40);
        Dolphin myDolphin1 = new Dolphin("canine" , "omar" , 4 , false , "ocean" , 40);
        Dolphin myDolphin2 = new Dolphin("canine" , "omar" , 4 , false , "ocean" , 40);
        Dolphin myDolphin3 = new Dolphin("canine" , "omar" , 4 , false , "ocean" , 40);
        Dolphin myDolphin4 = new Dolphin("canine" , "omar" , 4 , false , "ocean" , 40);

        System.out.println(myPenguin.toString());
        myZoo.addAquaticAnimal(myPenguin);
        myZoo.addAquaticAnimal(myPenguin1);
        myZoo.addAquaticAnimal(myPenguin2);
        myZoo.addAquaticAnimal(myPenguin3);

        myZoo.addAquaticAnimal(myDolphin);
        myZoo.addAquaticAnimal(myDolphin1);
        myZoo.addAquaticAnimal(myDolphin2);
        myZoo.addAquaticAnimal(myDolphin3);
        myZoo.addAquaticAnimal(myDolphin4);

        System.out.println(myZoo.getAquatics());
        myZoo.getAquatics()[0].swim();
        float maxdepthpenguinSwimmingDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println(maxdepthpenguinSwimmingDepth);

        myZoo.displayNumberOfAquaticByType();

    }
}