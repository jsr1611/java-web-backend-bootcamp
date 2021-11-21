package Nov9;

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] familyMembers = new Person[] {new Person("Jumanazar Said", 31, Role.SON, Role.WORKER)};
        Mahalla[] mahallas = new Mahalla[]{
                new Mahalla( new Area("Jangiota mahallasi", "mavjud emas", 500.66, 4500),
                new KHOKIM("Toshmat Teshaev", 62, Role.KHOKIM_MAHALLA, Role.KHOKIM_MAHALLA, "Everyday between 10:00 - 17:00"),
                new House[]{new House("Said R.K.", 4, familyMembers)})};

        District[] districts = new District[] {
                new District(
                    new Area("Hazorasp", "Hazorasp", 2500.53, 50000),
                    new KHOKIM("O‘ktam Rustamovich Masharipov", 62, Role.KHOKIM_DISTRICT, Role.KHOKIM_DISTRICT, "Tuesday between 10:00 - 16:00"),
                    mahallas
        )};
        Region[] regions = new Region[]{
                new Region(
                        new Area("Khorezm", "Urgench", 6300.0, 1777000),
                        new KHOKIM("Farkhod Ermanov", 63, Role.KHOKIM_REGION, Role.KHOKIM_REGION, "Mondays between 11:00 - 15:00"),
                        districts
                ), new Region(
                        new Area("Karakalpakstan", "Nukus", null, null),
                null,
                null
        ),
                new Region(
                        new Area("Bukhara", "Bukhara", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Navai", "Navai", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Kashkadarya", "Karshi", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Surkhandarya", "Termez", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Samarkand", "Samarkand", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Jizzakh", "Jizzakh", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Syrdarya", "Gulistan", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Tashkent", "Tashkent", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Namangan", "Namangan", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Andijan", "Andijan", null, null),
                        null,
                        null
                ),
                new Region(
                        new Area("Farghana", "Farghana", null, null),
                        null,
                        null
                ),

        };
        Republic[] republics = new Republic[]{
                new Republic(
                        new Area("Uzbekistan", "Tashkent", 447700.0, 34000000),
                        regions,
                        new President(
                            "Shavkat Mirziyoyev",
                              64,
                                Role.PRESIDENT,
                                Role.PRESIDENT
                        ),
                        "Uzbek"
                )
        };

        boolean systemOn = true;
        Scanner sc = new Scanner(System.in);
        Integer choice = -1;
        while (systemOn){
            for(int i = 0; i < republics.length; i++){
                System.out.println((i+1) + ". " +  republics[i].getName());
            }
            System.out.print(
                    "----------MENU----------\n" +
                    "Choose a republic:");

            choice = sc.nextInt();
            if(choice < 1 || choice > republics.length){
                System.out.println("Wrong menu option! Try again.");
                break;
            }
            Republic republic = republics[choice-1];
            while (true) {
                System.out.printf("1. Display %s info | 2. Display %s | 3. Return to preview menu\n", "republic", "regions");
                choice = null;
                while (choice == null) {

                    System.out.print("You have chosen '" + republic.getName() + "'. Choose next menu: ");
                    choice = sc.nextInt();
                    if (choice < 1 || choice > 3) {
                        System.out.println("Wrong menu option! Try again.");
                        continue;
                    }
                }
                System.out.println("------------------------");
                Region[] regions_uz = republic.getRegions();
                int counter = 1;
                if (choice == 1) {
                    System.out.println("------------------------");
                    System.out.println(republic.toString());
                    System.out.println("------------------------");
                } else if (choice == 2) {
                    for (Region region : regions_uz) {
                        System.out.println(counter + ". " + region.name);
                        counter++;
                    }
                    System.out.println("------------------------");
                    while(true) {
                        System.out.print("Choose a region: ");
                        choice = sc.nextInt();
                        if (choice < 1 || choice > regions.length) {
                            System.out.println("Wrong menu option! Try again.");
                            continue;
                        }
                        Region region = regions[choice - 1];
                        System.out.println("------------------------");
                        System.out.print("You have chosen '" + region.getName() + "'. Choose next menu: ");


                        District[] districts_uz = region.getDistricts();
                        counter = 1;
                        if (choice == 1) {
                            System.out.println("------------------------");
                            System.out.println(region.toString());
                            System.out.println("------------------------");
                        } else if (choice == 2) {
                            for (District district : districts_uz) {
                                System.out.println(counter + ". " + region.name);
                                counter++;
                            }
                            System.out.println("------------------------");
                        }
                    }

                } else {
                    break;
                }
            }
        }





    }
}
