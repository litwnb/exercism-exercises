import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> list = new ArrayList<>();
        if (prc1.compareTo(prc2) < 0) {
            list.add(prc1);
            list.add(prc2);
        } else {
            list.add(prc2);
            list.add(prc1);
        }
        return list;
    }
}
