package com.gdm.bduvguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PrivateUVList extends AppCompatActivity {
    private  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_uvcategory);

        //For the implementation of back button

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                " BRAC University (BRACU)",
                " North South University (NSU)",
                " Independent University Bangladesh (IUB)",
                " Ahsanullah University of Science and Technology (AUST)",
                " Military Institute of Science and Technology (MIST)",
                " East West University (EWU)",
                " United International University (UIU)",
                " University of Asia Pacific (UAP)",
                " American International University-Bangladesh (AIUB)",
                " University of Liberal Arts Bangladesh (ULAB)",
                " Dhaka International University (DIU)",
                " International University of Business Agriculture and Technology (IUBAT)",
                " International Islamic University Chittagong (IIUC)",
                " Bangladesh University of Business and Technology (BUBT)",
                " BGC Trust University Bangladesh",
                " East Delta University (EDU)",
                " Premier University (PU)",


















        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Here the university info will display..." +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });

    }

    //back button method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
