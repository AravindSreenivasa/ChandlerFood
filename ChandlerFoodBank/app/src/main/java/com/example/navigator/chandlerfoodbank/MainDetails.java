package com.example.navigator.chandlerfoodbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.SQLException;
import java.util.ArrayList;

import DatabaseHelperClass.DataSource;

public class MainDetails extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.navigator.chandlerfoodbank.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(HomePageActivity.EXTRA_MESSAGE);
        setContentView(R.layout.activity_main_details);

        ListView list_view = (ListView) findViewById(R.id.listview_details);

        DataSource dataSource = new DataSource(getBaseContext());
        try {
            dataSource.open();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if(message.equals("0")){
            //yet to be done
            int a = 9;
        }
        else if(message.equals("1")){
            arrayList = dataSource.GetHelp();
        }
        else if(message.equals("2")){
            arrayList = dataSource.GetEvents();
        }
        else if(message.equals("3")){
            arrayList = dataSource.GetJobs();
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(getBaseContext(),R.layout.activity_main_details,R.id.textView_details,arrayList);

        list_view.setAdapter(arrayAdapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(getBaseContext(),MainDetails.class);
                intent.putExtra(EXTRA_MESSAGE, Integer.toString(position));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
