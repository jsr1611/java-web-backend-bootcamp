package Day4.Electronics;

public class ElectronicsDemo {
    public static void main(String[] args) {
        ElectronicItem elItem = new ElectronicItem("Electronic Device", 1990);
        elItem.sound();

        ElectronicItem galaxy5 = new MobilePhone("Galaxy5", 2013);
        galaxy5.sound();

        ElectronicItem earpod = new Earplug("Apple Earpods", 2017);
        earpod.sound();

        ElectronicItem subwoofer = new Stereo("Sub", 1999);
        subwoofer.sound();


    }



}
