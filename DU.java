package com.gdm.bduvguide.GeneralUniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.gdm.bduvguide.R;

public class DU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_du);
        WebView webView =(WebView)findViewById(R.id.webView) ;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.loadUrl("file:///android_asset/html_directory/DU.html");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
