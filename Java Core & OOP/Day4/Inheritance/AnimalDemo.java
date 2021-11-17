package Day4.Inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion",4,"yellow",true);
        animal.info();

        Bird flamingo = new Bird("Flamingo", 2, "white", false, true, 30);
        flamingo.info();

        Pet pet = new Pet("pet", "Pete", 4, "dark green", true);
        pet.info();
        pet.sound();

        Bird straus = new Straus("straus", "white", 50);
        straus.info();

        Bird bat = new Bat("bat", "black", 15);
        bat.info();


        Pet cow = new Cow("Queen",  "brown");
        cow.info();
        cow.sound();

        Pet dog = new Dog("Simba", "blackwhite");
        dog.info();
        dog.sound();

        Cat cat = new Cat("Kitty", "white");
        cat.info();
        cat.sound();

        Bird eagle = new Eagle("Asian Eagle", "dark brown", 25);
        eagle.info();



    }
}
