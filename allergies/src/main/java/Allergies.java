import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Allergies {
    private int score;
    private final List<Allergen> allergenList;

    public Allergies(int score) {
        this.score = score % 256;
        allergenList = new ArrayList<>();
    }

    private void calculateAllergies() {
        if (score >= 128) {
            allergenList.add(Allergen.CATS);
            score -= 128;
        }
        if (score >= 64) {
            allergenList.add(Allergen.POLLEN);
            score -= 64;
        }
        if (score >= 32) {
            allergenList.add(Allergen.CHOCOLATE);
            score -= 32;
        }
        if (score >= 16) {
            allergenList.add(Allergen.TOMATOES);
            score -= 16;
        }
        if (score >= 8) {
            allergenList.add(Allergen.STRAWBERRIES);
            score -= 8;
        }
        if (score >= 4) {
            allergenList.add(Allergen.SHELLFISH);
            score -= 4;
        }
        if (score >= 2) {
            allergenList.add(Allergen.PEANUTS);
            score -= 2;
        }
        if (score == 1) {
            allergenList.add(Allergen.EGGS);
        }
    }

    public boolean isAllergicTo(Allergen allergen) {
        calculateAllergies();
        return allergenList.contains(allergen);
    }

    public List<Allergen> getList() {
        calculateAllergies();
        Collections.sort(allergenList);
        return allergenList;
    }
}
