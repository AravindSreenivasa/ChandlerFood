package com.example.navigator.chandlerfoodbank;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.sql.SQLException;
import java.util.ArrayList;

import DatabaseHelperClass.DataSource;
import DetailsClass.Categories;

public class HomePageActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.navigator.chandlerfoodbank.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView list_view = (ListView) findViewById(R.id.listView);

        DataSource dataSource = new DataSource(getBaseContext());
        try {
            dataSource.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ArrayList<String> arrayList = dataSource.GetCategories();

        ArrayAdapter arrayAdapter = new ArrayAdapter(getBaseContext(),R.layout.content_home_page,R.id.textView,arrayList);

        list_view.setAdapter(arrayAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(getBaseContext(),MainDetails.class);
                intent.putExtra(EXTRA_MESSAGE, position);
                startActivity(intent);
            }
        });


    }

}
