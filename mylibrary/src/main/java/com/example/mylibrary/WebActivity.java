package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class WebActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String name = getIntent().getStringExtra("name");
        TextView textView = (TextView) findViewById(R.id.textField);
        textView.setText(name);
//        WebView webView = new WebView(getApplicationContext());
//
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        setContentView(webView);
//        webView.loadUrl("https://tickets.yayvo.com");
    }
}
