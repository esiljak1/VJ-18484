package ba.unsa.etf.rma.vj_18484;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailActivity extends AppCompatActivity {
    private EditText title, genre, releaseDate, homepage;
    private ImageView icon;
    private Movie movie;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        title = (EditText) findViewById(R.id.title);
        genre = (EditText) findViewById(R.id.genre);
        releaseDate = (EditText) findViewById(R.id.releaseDate);
        homepage = (EditText) findViewById(R.id.homepage);
        icon = (ImageView) findViewById(R.id.icon);

        String title = getIntent().getStringExtra("title");
    }
}
