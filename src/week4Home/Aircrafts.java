package week4Home;

/**
 * Created by diana.kave on 3/19/2018.
 */
public class Aircrafts {
    int maxSpeed = 0;
    public void fly() {
        System.out.println("I'm flying!");
    }
    public void printDescription() {
        System.out.println(this.getClass() + " flying at max speed: " + this.maxSpeed + "km/h");
    }

}