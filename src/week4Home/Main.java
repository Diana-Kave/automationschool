package week4Home;

/**
 * Created by diana.kave on 3/19/2018.
 */
public class Main {
    public static void main(String[] args) {
        RegularGlider rg = new RegularGlider();
        PropellerDrivenAircraft pda = new PropellerDrivenAircraft();
        TurboJetAircraft tj = new TurboJetAircraft();
        TurboJetAircraftHypersonic tjah = new TurboJetAircraftHypersonic();

        rg.printDescription();
        rg.Glide();
        pda.printDescription();
        pda.Glide();
        tj.printDescription();
        tj.fly();
        tjah.printDescription();
        tjah.fly();
    }
}


