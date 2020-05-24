package com.example.androidfeatures1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //-->SeekBar         //RatingBar
    // TextView v;      RatingBar rb;
    //EditText e;      TextView v;
    //SeekBar sb;
    //Button b;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      // -->SEEKBAR //v = (TextView) findViewById(R.id.textView);
        //e = (EditText) findViewById(R.id.Editext);
        //sb = (SeekBar) findViewById(R.id.seekBar);
        //b = (Button) findViewById(R.id.button);
        //sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        //  @Override
        //public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //  e.setTextSize(progress);
        //v.setText(progress + " ");
        //}
        //@Override
        //public void onStartTrackingTouch(SeekBar seekBar) {
        //  Toast.makeText(MainActivity.this, "started", Toast.LENGTH_LONG);
        //}

        //@Override
        //public void onStopTrackingTouch(SeekBar seekBar) {

        //}
        //});
        //}
        //  public void onClicked(View v) {
        //        Intent intent=new Intent(MainActivity.this,SecondActitvity.class);
        //      startActivity(intent);
        //}

        //-->RATINGBAR
       // rb=(RatingBar)findViewById(R.id.ratingBar);
        //v=(TextView)findViewById(R.id.textView2);
        //rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        //    @Override
          //  public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            //    v.setText("value is"+rating);
            //}
        //});
        //WEBVIEW
       // wv=(WebView)findViewById(R.id.webview);
        //wv.getSettings().setJavaScriptEnabled(true);
        //wv.setWebViewClient(new MyBrowser() );
        //wv.loadUrl("https://www.javatpoint.com/android-explicit-intent-example";
    //}
    //private class MyBrowser extends WebViewClient
    //{
      //  @Override
        //public boolean shouldOverrideUrlLoading(WebView view, String url) {

          //  wv.loadUrl(url);
            //return true;
        //}
    }
}



