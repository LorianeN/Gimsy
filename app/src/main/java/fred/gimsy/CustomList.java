package fred.gimsy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Loriane on 04/12/2015.
 */
public class CustomList {
    private final Activity context;
    private String nom, type;

    public CustomList(Activity context,String type, String nom) {
        this.context = context;
        this.nom = nom;
        this.type = type;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.single_lieu, null, true);
        TextView type = (TextView) rowView.findViewById(R.id.type);
        TextView nom = (TextView) rowView.findViewById(R.id.nom);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);

        type.setText(web[lieuId]);
        imageView.setImageResource(R.drawable.mic);
        return rowView;
    }
}
