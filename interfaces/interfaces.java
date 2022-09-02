package interfaces;

import java.util.logging.SocketHandler;
//interfaces area like a bunch of function without defining the body
//interface is like a blueprint of a class it tells us what a class must do
//in abstract class we can't have multiple inheritance
//in this we must define all the abstract function of interface in the child class
interface cycle
{
    void brake(int speed);
    void speed(int speed);


}
class avoncycle implements cycle
{
    void blowhorn()
    {
        System.out.println("HORN !!!");
    }

    @Override
    public void brake(int speed) {
        System.out.println("applying brake");
    }

    @Override
    public void speed(int speed) {
        System.out.println("increasing speed");
    }
}


public class interfaces {
    public static void main(String[] args) {
       cycle cy =new avoncycle();
       cy.brake(1);
    }
}
