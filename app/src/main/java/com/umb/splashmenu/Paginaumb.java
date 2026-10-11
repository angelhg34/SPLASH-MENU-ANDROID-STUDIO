package com.umb.splashmenu;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
public class Paginaumb extends AppCompatActivity {
    private WebView webView;
    private static final String URL_UMB = "https://www.umb.edu.co/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaumb);
        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Para abrir dentro de la app
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilita JavaScript sies necesario
        webView.loadUrl(URL_UMB);
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // Navega hacia atrás en el historial del WebView
        } else {
            super.onBackPressed();
        }
    }
}