package fred.gimsy;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.TextView;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        Button selectButton = (Button) findViewById(R.id.selectButton);
        Button newButton = (Button) findViewById(R.id.newButton);
        TextView nameAppli=(TextView)findViewById(R.id.nameAppli);
        TextView descripAppli=(TextView)findViewById(R.id.descripAppli);

        Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/gravity/Gravity-Book.otf");
        selectButton.setTypeface(typeFace);
        newButton.setTypeface(typeFace);
        nameAppli.setTypeface(typeFace);
        descripAppli.setTypeface(typeFace);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.yourentry, menu);
        return true;
    }
}
