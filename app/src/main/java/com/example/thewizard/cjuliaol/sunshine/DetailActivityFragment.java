package com.example.thewizard.cjuliaol.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    private static final String TAG = "DetailActivityFragment";

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView forecastText = (TextView) view.findViewById(R.id.forecast_text);

        String forecast = getActivity().getIntent().getStringExtra(ForecastFragment.EXTRA_TEXT);
        forecastText.setText(forecast);

        Log.d(TAG,"Pronostico: " +forecast);


        return view;
    }
}
