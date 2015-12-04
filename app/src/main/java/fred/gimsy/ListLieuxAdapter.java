package fred.gimsy;

/**
 * Created by Sandjiv on 24/11/2015.
 */
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListLieuxAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<ObjetLieux> data;
    private static LayoutInflater inflater=null;
    Drawable d;

    public ListLieuxAdapter(Activity a, ArrayList<ObjetLieux> d) {
        Log.d("SONPERE", "j'ai créé mon adapter");
        activity = a;
        data=d;
        Log.d("SONPERE", "il a reçu "+data.size()+" items");
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    static class ViewHolderItem{
        public TextView typeItem;
        public TextView nomItem;
        public ImageView XButton;
    }
    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        ViewHolderItem viewHolder =null;
        if(convertView==null) {
            vi = inflater.inflate(R.layout.items_cell_content, null);
            viewHolder = new ViewHolderItem();
            viewHolder.typeItem = (TextView) vi.findViewById(R.id.type);
            viewHolder.nomItem = (TextView) vi.findViewById(R.id.nom);
            viewHolder.XButton = (ImageView) vi.findViewById(R.id.XButton);
            vi.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolderItem) convertView.getTag();
        }
        final  ObjetLieux Item = data.get(position);

        viewHolder.typeItem.setText(Item.getType());
        viewHolder.nomItem.setText(Item.getNom());
        viewHolder.XButton.setImageResource(R.drawable.mic);
        return vi;
    }
}