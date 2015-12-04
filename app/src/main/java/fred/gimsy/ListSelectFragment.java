package fred.gimsy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import fred.gimsy.lieux.LieuxContent;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class ListSelectFragment extends ListFragment{

    ArrayList<ObjetLieux> arrayLieux = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    /**
     * The fragment's ListView/GridView.
     */
    private ListView mListView;
    /**
     * The Adapter which will be used to populate the ListView/GridView with
     * Views.
     */
    private ListLieuxAdapter ItemAdapter;

    private ArrayAdapter mAdapter;

    // TODO: Rename and change types of parameters
    public static ListSelectFragment newInstance() {
        Log.d("SONPERE","nouvelle instance d'Item Fragment");
        ListSelectFragment fragment = new ListSelectFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    public ListSelectFragment(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SONPERE", "suis passé par le constructeur une fois");
        // TODO: Change Adapter to display your content
        mAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, LieuxContent.ITEMS);
        // TODO: Change Adapter to display your content
        ItemAdapter = new ListLieuxAdapter(getActivity(), arrayLieux);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.mylist,
                R.id.Itemname,itemname));
        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_list_select, container, false);


        Log.d("SONPERE", "je créé la view de mon fragment list detail_liste");
        mListView = (ListView) view.findViewById(R.id.list_lieux);
        mListView.setAdapter(ItemAdapter);
        Log.d("SONPERE","c'est fait (view Fragment item)!");
        // Set OnItemClickListener so we can be notified on item clicks
        mListView.setOnItemClickListener(this);
        ItemAdapter.notifyDataSetChanged();

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (null != mListener) {
//TODO : Mettre l'activité suivante >> navigation
       }
    }

    /**
     * The default content for this Fragment has a TextView that is shown when
     * the list is empty. If you would like to change the text, call this method
     * to supply the text it should use.
     */
    public void setEmptyText(CharSequence emptyText) {
        View emptyView = mListView.getEmptyView();

        if (emptyView instanceof TextView) {
            ((TextView) emptyView).setText(emptyText);
        }
    }
}
