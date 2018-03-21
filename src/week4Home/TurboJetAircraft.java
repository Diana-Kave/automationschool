package week4Home;

/**
 * Created by diana.kave on 3/19/2018.
 */
class TurboJetAircraft extends Aircrafts implements AircraftEngines{
    TurboJetAircraft() {
        super();
        this.maxSpeed = 900;
    }

    @Override
    public void fly() {
        turnOnAircraftEngines();
        super.fly();
    }

    @Override
    public void turnOnAircraftEngines() {
        System.out.println("Engines turn on!");
    }
}