package leoh4410.proyectomuni.activities.menu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import leoh4410.proyectomuni.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NearFragment extends Fragment {


    public NearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_near, container, false);
    }

}
