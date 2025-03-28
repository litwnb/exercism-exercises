import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private final int STRENGTH = ability();
    private final int DEXTERITY = ability();
    private final int CONSTITUTION = ability();
    private final int INTELLIGENCE = ability();
    private final int WISDOM = ability();
    private final int CHARISMA = ability();
    private int hitpoints = 10;

    int ability() {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(rand.nextInt(1, 7));
        list.add(rand.nextInt(1, 7));
        list.add(rand.nextInt(1, 7));
        list.add(rand.nextInt(1, 7));
        list.sort(Collections.reverseOrder());
        return list.get(0) + list.get(1) + list.get(2);
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
        return STRENGTH;
    }

    int getDexterity() {
        return DEXTERITY;
    }

    int getConstitution() {
        return CONSTITUTION;
    }

    int getIntelligence() {
        return INTELLIGENCE;
    }

    int getWisdom() {
        return WISDOM;
    }

    int getCharisma() {
        return CHARISMA;
    }

    int getHitpoints() {
        hitpoints += modifier(getConstitution());
        return hitpoints;
    }
}
