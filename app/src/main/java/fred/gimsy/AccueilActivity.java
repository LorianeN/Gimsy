package fred.gimsy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void selectLieux(View view) {
        //TODO passer à l'activité suivante
        Intent intent = new Intent(AccueilActivity.this,
                Detail_liste.class);
        intent.putExtra("","");
        startActivity(intent);
    }
}
