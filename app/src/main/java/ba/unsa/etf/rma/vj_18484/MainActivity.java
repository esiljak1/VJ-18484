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

    private void listItemClickListener(AdapterView<?> parent, View view, int position, long id){
        Intent movieDetailIntent = new Intent(this, MovieDetailActivity.class);
        Movie movie = adapter.getItem(position);
        movieDetailIntent.putExtra("title", movie.getTitle());
        this.startActivity(movieDetailIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        listView = (ListView)findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.editText);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listItemClickListener(parent, view, position, id);
            }
        });

        entries = MovieBuff.getInstance().getMovies();
        adapter = new MovieListAdapter(this, R.layout.list_element, entries);

        listView.setAdapter(adapter);

    }
}
