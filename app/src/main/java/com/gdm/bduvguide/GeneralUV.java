package com.gdm.bduvguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GeneralUV extends AppCompatActivity {

private TextView tv,tv1;
    private ListView listView;

    @Override


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_public_uvcategory);

            listView = (ListView) findViewById(R.id.list);

            tv=(TextView)findViewById(R.id.tv1);
        tv1=(TextView)findViewById(R.id.tv2);
            tv.setText("Please Select Your Desired University ");
        tv1.setText(null);

        //For the implementation of back button

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


            // Defined Array values to show in ListView
            String[] values = new String[] {
                    " University of Dhaka",
                    " University of Chittagong",
                    " Rajshahi University",
                    " Jahangirnagar University",
                    " Khulna University",
                    " Jagannath University",
                    " Cumilla University",
                    " Bangladesh Open University",
                    " Islamic University",
                    " National University of Bangladesh",
                    " Begum Rokeya University",
                    " Jatiya Kabi Kazi Nazrul Islam University",
                    " Barisal University",


















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
//                    Toast.makeText(getApplicationContext(),
//                            "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                            .show();


                    if (position==0)
                    {
//                        Intent i=new Intent(GeneralUV.this,DU.class);
//                        startActivity(i);
                        setContentView(R.layout.activity_du);
                        WebView webView =(WebView)findViewById(R.id.webView) ;
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setWebChromeClient(new WebChromeClient());

                        webView.loadUrl("file:///android_asset/html_directory/DU.html");

                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                    }


                    if (position==1)
                    {
//                        Intent i=new Intent(GeneralUV.this,DU.class);
//                        startActivity(i);
                        setContentView(R.layout.activity_du);
                        WebView webView =(WebView)findViewById(R.id.webView) ;
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.setWebChromeClient(new WebChromeClient());

                        webView.loadUrl("file:///android_asset/html_directory/CU.html");

                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
