package Nov7.Practice;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("soat", 250.0, "Tissot");
        product.printInfo();
        System.out.println();
        Person person = new Person("Jim", "Dev", "USA");
        Worker worker = new Worker(person, 120000.0, "Software Engineer");
        Worker programmer = new Programmer(worker, "Java", "ASUS");
        programmer.printInfo();

        Animal eagle = new Bird(2,"eagle");
        eagle.printInfo();

        Animal cat = new Cat(2, "Kitty");
        cat.printInfo();

        Product plane = new Product("Airbus", 1000000.0, "AirBus");
        Technics planeTechnics = new Technics(plane, "Airbus 202", 100.0);
        Technics airbus = new Plane(plane, planeTechnics, "white", 300);
        airbus.printInfo();

        Product phoneProd = new Product("Galaxy", 500.0, "Samsung");
        Technics phonetech = new Technics(phoneProd, "S10", 3.7);
        Electronics samsungPhone = new Phone(phoneProd, phonetech, 256);
        samsungPhone.printInfo();


        Person student = new Student(new Person("Javohir", "Aliev", "Uzbekistan"),
                                    "National University", 200.0);
        student.printInfo();

    }
}
