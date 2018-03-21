package week4Home;

/**
 * Created by diana.kave on 3/19/2018.
 */
public class PropellerDrivenAircraft extends Glider implements AircraftEngines {

    public void fly() {
        turnOnAircraftEngines();
        super.fly();
    }

    PropellerDrivenAircraft() {
        super();
        this.maxSpeed = 300;
    }


    public void turnOnAircraftEngines() {
        System.out.println("Engines on!");
    }
}