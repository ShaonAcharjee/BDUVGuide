package com.gdm.bduvguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class PublicUVCategory extends AppCompatActivity {
 private  ListView listView;
 TextView tv;
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
                "General University",
                "Engineering University",
                "Textile University",
                "Science and Technology University",
                "Veterinary University",
                "Agriculture University",
                "Maritime University",

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
//                Toast.makeText(getApplicationContext(),
//                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                        .show();


                if(position==0){
                    Intent i = new Intent( PublicUVCategory.this,GeneralUV.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i = new Intent( PublicUVCategory.this,EnggUv.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i = new Intent( PublicUVCategory.this,TextileUV.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i = new Intent( PublicUVCategory.this,ScienceTechUV.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i = new Intent( PublicUVCategory.this,VatUV.class);
                    startActivity(i);
                }
                if(position==5){
                    Intent i = new Intent( PublicUVCategory.this,AgriUV.class);
                    startActivity(i);
                }
                if(position==6){
                    Intent i = new Intent( PublicUVCategory.this,MeriTimeUV.class);
                    startActivity(i);
                }

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
