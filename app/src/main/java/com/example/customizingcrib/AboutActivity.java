package com.example.customizingcrib;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.webkit.WebView;


import static com.example.customizingcrib.MainActivity.array;

public class AboutActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView webView = (WebView) findViewById(R.id.webView);
        String str = getIntent().getStringExtra("textView1");
        if (str.equals(array[0])) webView.loadUrl("file:///android_asset/maths");
        if (str.equals(array[1]))  webView.loadUrl("file:///android_asset/history");
        if (str.equals(array[2])) webView.loadUrl("file:///android_asset/physics");
        if (str.equals(array[3])) webView.loadUrl("file:///android_asset/english");
    }
}
