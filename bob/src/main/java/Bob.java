public class Bob {
    public String hey(String phrase) {
        phrase = phrase.trim();
        if (phrase.isEmpty())
            return "Fine. Be that way!";
        if (hasLetters(phrase) && phrase.toUpperCase().equals(phrase) && phrase.endsWith("?"))
            return "Calm down, I know what I'm doing!";
        if (hasLetters(phrase) && phrase.toUpperCase().equals(phrase))
            return "Whoa, chill out!";
        if (phrase.endsWith("?"))
            return "Sure.";
        return "Whatever.";
    }

    private boolean hasLetters(String phrase) {
        for (char ch : phrase.toCharArray()) {
            if (Character.isAlphabetic(ch))
                return true;
        }
        return false;
    }
}
