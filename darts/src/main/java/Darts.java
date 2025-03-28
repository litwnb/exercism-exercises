class Darts {
    int score(double xOfDart, double yOfDart) {
        int score;
        double res = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
        if (res <= 1)
            score = 10;
        else if (res <= 5) {
            score = 5;
        } else if (res <= 10) {
            score = 1;
        } else
            score = 0;
        return score;
    }
}
