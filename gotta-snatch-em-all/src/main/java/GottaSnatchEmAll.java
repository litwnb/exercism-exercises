import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty())
            return false;
        int mySize = myCollection.size();
        int theirSize = theirCollection.size();
        Set<String> myTempCollection;
        if (mySize > theirSize) {
            myTempCollection = new HashSet<>(myCollection);
            myTempCollection.addAll(theirCollection);
        } else {
            mySize = theirSize;
            myTempCollection = new HashSet<>(theirCollection);
            myTempCollection.addAll(myCollection);
        }
        int fullSize = myTempCollection.size();
        return fullSize > mySize;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commons = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size(); i++) {
            commons.retainAll(collections.get(i));
        }
        return commons;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> cards = new HashSet<>();
        for (Set<String> set : collections) {
            cards.addAll(set);
        }
        return cards;
    }
}
