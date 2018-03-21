package week4Home;

/**
 * Created by diana.kave on 3/19/2018.
 */
public class TurboJetAircraftHypersonic extends TurboJetAircraft {
    @Override
    public void fly() {
        super.fly();
        this.hyperSonicFlight();
    }

    private void hyperSonicFlight() {
        System.out.println("Hypersonic engines on!");
    }

    TurboJetAircraftHypersonic() {
        super();
        this.maxSpeed = 10000;
    }
}