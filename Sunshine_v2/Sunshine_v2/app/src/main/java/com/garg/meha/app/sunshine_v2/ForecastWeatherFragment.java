package com.garg.meha.app.sunshine_v2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastWeatherFragment extends Fragment {

    public ForecastWeatherFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_forecast, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);

        String[] forecastList = {
                "Today - Clear - 34",
                "Monday - Rain - 20",
                "Tueday - Clear - 34",
                "Wednesday - Rain - 20",
                "Thursday - Clear - 34",
                "Friday - Rain - 20",
                "Saturday - Clear - 34"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, forecastList);
        listView.setAdapter(adapter);
        return rootView;
    }
}
