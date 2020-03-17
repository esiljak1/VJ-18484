package ba.unsa.etf.rma.vj_18484;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailActivity extends AppCompatActivity {
    private TextView title, genre, releaseDate, homepage, overview;
    private ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        title = (TextView) findViewById(R.id.title);
        genre = (TextView) findViewById(R.id.genre);
        releaseDate = (TextView) findViewById(R.id.releaseDate);
        homepage = (TextView) findViewById(R.id.homepage);
        overview = (TextView) findViewById(R.id.overview);
        icon = (ImageView) findViewById(R.id.icon);

        Intent intent = getIntent();
        title.setText(intent.getStringExtra("title"));
        genre.setText(intent.getStringExtra("genre"));
        releaseDate.setText(intent.getStringExtra("releaseDate"));
        homepage.setText(intent.getStringExtra("homepage"));
        overview.setText(intent.getStringExtra("overview"));

        if(genre.getText().equals("Action")){
            icon.setImageResource(R.drawable.action1);
        }else if(genre.getText().equals("Comedy")){
            icon.setImageResource(R.drawable.comedy);
        }else{
            icon.setImageResource(R.drawable.drama);
        }

    }
}
