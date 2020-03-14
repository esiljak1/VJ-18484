package ba.unsa.etf.rma.vj_18484;

import android.os.Bundle;
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

    }
}
