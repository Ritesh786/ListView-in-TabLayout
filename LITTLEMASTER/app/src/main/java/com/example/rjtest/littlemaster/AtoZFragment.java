package com.example.rjtest.littlemaster;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AtoZFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView mlstview;
    private ArrayAdapter  madaper;
    private ArrayList<String> mDummydata;
    private ImageView mimageView;

    public AtoZFragment() {
        // Required empty public constructor
      //  AtoZFragment atoZFragment=new AtoZFragment();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_ato_z, container, false);

        mDummydata = new ArrayList<>();
        for (int index = 65; index <= 90; index++) {
            mDummydata.add((char) index + " For");
        }
        mlstview = (ListView) rootview.findViewById(R.id.list);
        madaper = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,mDummydata);
       mlstview.setAdapter(madaper);

        mlstview.setOnItemClickListener(this);
        return rootview;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}


