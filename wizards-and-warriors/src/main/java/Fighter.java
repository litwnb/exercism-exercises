abstract class Fighter {

    boolean isVulnerable() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("Fighter is a %s", this.getClass().getSimpleName());
    }

    abstract int damagePoints(Fighter fighter);
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return spellPrepared ? 12 : 3;
    }

    void prepareSpell() {
        spellPrepared = true;
    }
}
