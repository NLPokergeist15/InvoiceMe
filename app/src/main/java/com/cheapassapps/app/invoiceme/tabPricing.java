package com.cheapassapps.app.invoiceme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Nelson on 2/25/2017.
 */

public class tabPricing extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tabpricing, container, false);
        return rootView;
    }
}