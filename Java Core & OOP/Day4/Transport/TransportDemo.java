package Day4.Transport;

public class TransportDemo {
    public static void main(String[] args) {
        Transport transport = new Transport("express train", 1999);
        transport.info();

        Train train = new Intercity("Afrosiyob", 2000, "Toshkent-Samarkand");
        train.info();

        Transport tram = new Tram("Trolleybus", 1996, "Tashkent");
        tram.info();

        Vehicle matiz = new Car("Matiz II", 1996, 4);
        matiz.info();

        Vehicle truck = new Truck("Volvo", 2007, 6);
        truck.info();
    }
}
