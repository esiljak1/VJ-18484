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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
