package fred.gimsy;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.support.v7.app.AppCompatActivity;

public class SelectItemActivity extends AppCompatActivity implements OnFragmentInteractionListener {


    ItemsFragsPagerAdapter itemsFragsPagerAdapter;
    ViewPager mViewPager;
    Fragment[] ItemActionFragments = new Fragment[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SONPERE", "j'ai créé mon activité detail_liste");
        setTitle(getIntent().getStringExtra("nom"));
        ItemActionFragments[0] = ListSelectFragment.newInstance();
        ItemActionFragments[1] = ListDeleteFragment.newInstance("","");

        setContentView(R.layout.activity_select_item);
        // ViewPager and its adapters use support library fragments, so use getSupportFragmentManager.
        itemsFragsPagerAdapter = new ItemsFragsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.detail_liste_pager);
        Log.d("SONPERE", "show Progress true");
        mViewPager.setAdapter(itemsFragsPagerAdapter);
    }


    @Override
    public void onFragmentInteraction(String msg) {
        //Log.d("SONPERE", "j'ai appuyé sur l'item "+ msg);

    }

    public void onFragmentInteraction(Uri uri) {
    }

    // Since this is an object collection, use a FragmentStatePagerAdapter, and NOT a FragmentPagerAdapter.
    public class ItemsFragsPagerAdapter extends FragmentStatePagerAdapter {
        public ItemsFragsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return ItemActionFragments[i];
        }

        @Override
        public int getCount() {
            return ItemActionFragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "OBJECT " + (position + 1);
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void showDeleteFragment(){
        mViewPager.setCurrentItem(1);
    }

    public void showSelectFragment(){
        mViewPager.setCurrentItem(0);
    }
}
