package it.franco.crossover;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class MainActivity extends Activity {
 WebView w;
 protected void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);setContentView(w);w.loadUrl("file:///android_asset/index.html");}
 public void onBackPressed(){finish();}
}
