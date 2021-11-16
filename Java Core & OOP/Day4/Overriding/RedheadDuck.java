/*
Author: Jumanazar Saidov
Date: 2021.11.01
Definition: Overriding in OOP.
 */
package Day4.Overriding;

/**
 * Redhead Child of Duck
 */
public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am redhead duck!");
    }
}
