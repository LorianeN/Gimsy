package fred.gimsy;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class NewLieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_lieu);
        TextView scanText =(TextView)findViewById(R.id.scanText);
        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/gravity/Gravity-Book.otf");
        scanText.setTypeface(typeFace);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_new_lieu_activity, menu);
        return true;
    }
}
