import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();
        int temp = number % 16;
        if (temp >= 8) {
            list.add(Signal.JUMP);
            temp -= 8;
        }
        if (temp >= 4) {
            list.add(Signal.CLOSE_YOUR_EYES);
            temp -= 4;
        }
        if (temp >= 2) {
            list.add(Signal.DOUBLE_BLINK);
            temp -= 2;
        }
        if (temp == 1)
            list.add(Signal.WINK);
        if ((number / 16) % 2 == 0)
            Collections.reverse(list);
        return list;
    }

}
