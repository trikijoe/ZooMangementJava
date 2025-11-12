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
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");
        Animal dog = null;
        Animal dog2 = null;
        Animal dog3 = null;
        Animal dog4 = null;
        try {
         dog = new Animal("canine", "max" , 3 ,  true);
         dog2 = new Animal("Canine", "lll", 2, true);
         dog3 = new Animal("Canine", "lll", 2, true);
         dog4 = new Animal("Canine", "lll", 2, true);
        } catch (InvalidAgeException e) {
            System.out.println("error : " + e.getMessage());
            System.out.println("Nombre total d'animaux: " + myZoo.getNbrAnimals());
        }


        try {
            myZoo.addAnimal(dog);
            System.out.println("animal 1 ajoute ");

            myZoo.addAnimal(dog2);
            System.out.println("animal 2 ajoute");

            myZoo.addAnimal(dog3);
            System.out.println("animal 3 ajoute");


            myZoo.addAnimal(dog4);
            System.out.println("animal 4 ajoute");

        } catch (ZooFullException e) {
            System.out.println("error : " + e.getMessage());
            System.out.println("nombre total d'animeaux  " + myZoo.getNbrAnimals());
        } catch (IllegalArgumentException e) {
            System.out.println("error : " + e.getMessage());
            System.out.println("nombre total d'animaux: " + myZoo.getNbrAnimals());
        } catch (InvalidAgeException e){
            System.out.println(" error : " + e.getMessage());
        }


        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(dog3);
        System.out.println(index);

        System.out.println(myZoo.comparerZoo(myZoo , notMyZoo));

        Penguin myPenguin = null;
        Penguin myPenguin1 = null;
        Penguin myPenguin2 = null;
        Penguin myPenguin3 = null;
        Penguin myPenguin4 = null;

        Dolphin myDolphin = null;
        Dolphin myDolphin1 = null;
        Dolphin myDolphin2 = null;
        Dolphin myDolphin3 = null;
        Dolphin myDolphin4 = null;

        try {
            // Création des pingouins
            myPenguin = new Penguin("canine", "triki", 3, true, "antartic", 5.34f);
            myPenguin1 = new Penguin("canine", "triki", 3, true, "antartic", 52.34f);
            myPenguin2 = new Penguin("canine", "triki", 3, true, "antartic", 522.34f);
            myPenguin3 = new Penguin("canine", "triki", 3, true, "antartic", 5222.34f);
            myPenguin4 = new Penguin("canine", "triki", 3, true, "antartic", 52222.34f);

            // Création des dauphins
            myDolphin = new Dolphin("canine", "omar", 4, false, "ocean", 40);
            myDolphin1 = new Dolphin("canine", "omar", 4, false, "ocean", 40);
            myDolphin2 = new Dolphin("canine", "omar", 4, false, "ocean", 40);
            myDolphin3 = new Dolphin("canine", "omar", 4, false, "ocean", 40);
            myDolphin4 = new Dolphin("canine", "omar", 4, false, "ocean", 40);

        } catch (InvalidAgeException e) {
            System.out.println("Error " + e.getMessage());
        }

        if (myPenguin != null) {
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


            if (myZoo.getAquatics() != null && myZoo.getAquatics().length > 0 && myZoo.getAquatics()[0] != null) {
                myZoo.getAquatics()[0].swim();
            }

            float maxdepthpenguinSwimmingDepth = myZoo.maxPenguinSwimmingDepth();
            System.out.println("profondeur maximal de penguin  " + maxdepthpenguinSwimmingDepth);

            myZoo.displayNumberOfAquaticByType();


            //prosit 8
            SocieteArrayList societe = new SocieteArrayList();

            Employe e1 = new Employe(3, "Triki", "Joe", "it", 3);
            Employe e2 = new Employe(1, "Omar", "Fakh", "it", 1);

            societe.ajouterEmploye(e1);
            societe.ajouterEmploye(e2);

            societe.displayEmployes();

            societe.trierEmployesParId();
            societe.displayEmployes();

            societe.trierEmployeParNomDépartementEtGrade();
            societe.displayEmployes();

            societe.supprimerEmployer(e2);
            societe.displayEmployes();

        }
    }
}