package ba.unsa.etf.rma.vj_18484;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private ListView listView;
    private List<Movie> entries;
    private MovieListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        listView = (ListView)findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.editText);

        entries = MovieBuff.getInstance().getMovies();
        adapter = new MovieListAdapter(this, R.layout.list_element, R.id.itemName, entries);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent movieDetailIntent = new Intent(MainActivity.this, MovieDetailActivity.class);
                Movie movie = adapter.getItem(position);
                movieDetailIntent.putExtra("title", movie.getTitle());
                movieDetailIntent.putExtra("genre", movie.getGenre());
                movieDetailIntent.putExtra("releaseDate", movie.getReleaseDate());
                movieDetailIntent.putExtra("homepage", movie.getHomepage());
                movieDetailIntent.putExtra("overview", movie.getOverview());
                MainActivity.this.startActivity(movieDetailIntent);
            }
        });

    }
}
