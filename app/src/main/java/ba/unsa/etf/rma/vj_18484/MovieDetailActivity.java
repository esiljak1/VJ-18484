package ba.unsa.etf.rma.vj_18484;

import android.widget.EditText;
import android.widget.ImageView;

public class MovieDetailActivity {
    private EditText title, genre, releaseDate, homepage;
    private ImageView icon;
    private Movie movie;

    public MovieDetailActivity(Movie movie) {
        this.movie = movie;
    }

}
