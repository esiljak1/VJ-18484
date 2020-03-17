package ba.unsa.etf.rma.vj_18484;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MovieListAdapter extends ArrayAdapter<Movie> {
    private int resource;

    public MovieListAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Movie> objects) {
        super(context, resource, textViewResourceId, objects);
        this.resource = resource;
    }

    public MovieListAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout newView;
        if(convertView == null){
            newView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater li;
            li = (LayoutInflater)getContext().getSystemService(inflater);
            li.inflate(resource, newView, true);
        }else{
            newView = (LinearLayout)convertView;
        }
        Movie instance = getItem(position);
        TextView editText2 = (TextView) newView.findViewById(R.id.editText2);
        TextView editText4 = (TextView)newView.findViewById(R.id.editText4);
        ImageView icon = (ImageView)newView.findViewById(R.id.icon);

        editText2.setText(instance.getTitle());
        editText4.setText(instance.getGenre());
        if(instance.getGenre().equals("Action")){
            icon.setImageResource(R.drawable.action1);
        }else if(instance.getGenre().equals("Comedy")){
            icon.setImageResource(R.drawable.comedy);
        }else{
            icon.setImageResource(R.drawable.drama);
        }

        return newView;
    }
}
