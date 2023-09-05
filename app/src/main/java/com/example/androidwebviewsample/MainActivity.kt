package com.example.androidwebviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById < WebView >(R.id.webview);
        webView.settings.javaScriptEnabled = true;
        webView.loadUrl("https://app.pagecall.com/meet?room_id=64f693ae93ac39a38ba5ce9a");
    }
}