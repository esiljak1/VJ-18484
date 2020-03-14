package ba.unsa.etf.rma.vj_18484;

import androidx.annotation.NonNull;

public class Movie {
    private String title;
    private String genre;
    private String releaseDate;
    private String homepage;
    private String overview;

    public Movie(String title, String genre, String releaseDate, String homepage, String overview) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.homepage = homepage;
        this.overview = overview;
    }

    @NonNull
    @Override
    public String toString() {
        return title + "\n" + genre;
    }
}
