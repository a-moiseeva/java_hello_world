package animals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish=new Fish();
        Bird bird=new Bird();


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);
        animals.add(bird);

        for(Animal animal: animals){
            animal.eat();
        }


        Animal animal = new Dog();
        animal.eat();
   //     animal.run();  // - так нельзя!
        dog.run();

        Dog dogNew = (Dog) animal;
        dogNew.run();

        Animal animalCat = new Cat();
        animalCat.eat();
     //   Dog dog1 = (Dog) animalCat;
      //  animalCat.eat();
    //    animalCat.run();


        ArrayList<AbleToRun> runningAnimals = new ArrayList<>();
        runningAnimals.add(dog);
        runningAnimals.add(cat);
        runningAnimals.add(bird);
        for(AbleToRun runningAnimal : runningAnimals){
            runningAnimal.run();
        }


        AbleToFly ableToFly = bird;
        ableToFly.fly();




        AbleToRun cat1 = new Cat();

        Cat cat2 = (Cat) cat1;






    }
}
