package ba.unsa.etf.rma.vj_18484;

import java.util.ArrayList;
import java.util.List;

public class MovieBuff {
    private List<Movie> list = new ArrayList<>();

    public MovieBuff() {
        list.add(new Movie("Avengers: Endgame", "Action", "2019", "www.marvel.com", "wow such great"));
        list.add(new Movie("Bitka na Neretvi", "Action", "1969", "https://en.wikipedia.org/wiki/Battle_of_Neretva_(film)", "nice"));
        list.add(new Movie("The Wolf of Wall Street", "Drama", "2013", "https://en.wikipedia.org/wiki/The_Wolf_of_Wall_Street_(2013_film)", "wow"));
    }

    public List<Movie> getList() {
        return list;
    }
}
