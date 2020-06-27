package com.aerocheck.demoofmaps;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import java.lang.String;

import java.util.ArrayList;

public class Graph extends AppCompatActivity {
    BarChart barChart;
    TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        //creation of database
        Intent in = getIntent();
        Bundle b = in.getExtras();
        String s = b.getString("myname");
        tx = (TextView) findViewById(R.id.inte);
        tx.setText(s);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();

        barEntries.add(new BarEntry(248,0));
        barEntries.add(new BarEntry(29,1));
        barEntries.add(new BarEntry(76,2));
        barEntries.add(new BarEntry(0,3));
        barEntries.add(new BarEntry(0,4));
        barEntries.add(new BarEntry(59,5));
        barEntries.add(new BarEntry(29,6));

        BarDataSet barDataSet = new BarDataSet(barEntries,"Pollutants");

        //x-axis
        ArrayList<String> pollutant = new ArrayList<>();

        pollutant.add("PM10");
        pollutant.add("S02");
        pollutant.add("NO2");
        pollutant.add("PM2.5");
        pollutant.add("NH3");
        pollutant.add("CO");
        pollutant.add("O3");

        BarData theData = new BarData(pollutant,barDataSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);
    }


}


