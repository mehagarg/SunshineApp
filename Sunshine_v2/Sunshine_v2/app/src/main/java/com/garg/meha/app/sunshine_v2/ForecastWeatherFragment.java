package com.garg.meha.app.sunshine_v2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastWeatherFragment extends Fragment {

    public ForecastWeatherFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_forecast, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);

        final String[] forecastList = {
                "Today - Clear - 34",
                "Monday - Rain - 20",
                "Tueday - Clear - 34",
                "Wednesday - Rain - 20",
                "Thursday - Clear - 34",
                "Friday - Rain - 20",
                "Saturday - Clear - 34"};

        ArrayList<String> weatherForecast = new ArrayList<>(Arrays.asList(forecastList));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.list_view_item_forecast, R.id.textView_forecastITEM, weatherForecast);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), DetailActivity.class);
                String forecastDetail = forecastList[position].toString();
                intent.putExtra("Detail_Item", forecastDetail);
                startActivity(intent);
            }
        });
        return rootView;
    }
}
