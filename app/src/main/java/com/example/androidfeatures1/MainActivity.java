package com.example.androidfeatures1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
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
   //-->WEBVIEW WebView wv;
   /**AlertDialog TextView v1,v2,v3;
    Button b1,b2,b3;
    EditText username,password*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /**SEEKBAR v = (TextView) findViewById(R.id.textView);
        e = (EditText) findViewById(R.id.Editext);
        sb = (SeekBar) findViewById(R.id.seekBar);
        b = (Button) findViewById(R.id.button);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
          @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
          e.setTextSize(progress);
        v.setText(progress + " ");}
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
          Toast.makeText(MainActivity.this, "started", Toast.LENGTH_LONG);
        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
        }});}
        public void onClicked(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActitvity.class);
              startActivity(intent);}

        -->RATINGBAR
        rb=(RatingBar)findViewById(R.id.ratingBar);
        v=(TextView)findViewById(R.id.textView2);
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                v.setText("value is"+rating);
            }});

       --> WEBVIEW
        wv=(WebView)findViewById(R.id.webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyBrowser() );
        wv.loadUrl("https://www.javatpoint.com/android-explicit-intent-example";}
    private class MyBrowser extends WebViewClient
    {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
            wv.loadUrl(url);
    return true;}

        //ALERTDIALOG-->
       v1=(TextView)findViewById(R.id.textView);
        v2=(TextView)findViewById(R.id.textView2);
        v3=(TextView)findViewById(R.id.textView3);
       b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);

    b1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                v1.setText("sai");
            }});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.setText("ANDB0001");
            }
        });
        /**b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.alert,null);
               final EditText username=(EditText)view.findViewById(R.id.editText);
                final EditText password=(EditText)view.findViewById(R.id.editText2);
                AlertDialog.Builder bulider = new AlertDialog.Builder(MainActivity.this);
                bulider.setMessage("are you sure?");
                bulider.setView(view);
                bulider.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       String u=username.getText().toString();
                       String p=password.getText().toString();
                       if(u.equals("sai")&&p.equals("143")) {
                           v3.setText("100000");
                       }
                       else {
                           v3.setText("enter valid login details");
                       }
                    }
                });
                bulider.setNegativeButton("cancel", null);
                AlertDialog alert = bulider.create();
                alert.show();
            }
        });
    }
    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder bulider = new AlertDialog.Builder(MainActivity.this);
        bulider.setTitle("Really exit");
        bulider.setMessage("are you sure?");
        bulider.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               MainActivity.super.onBackPressed();
            }
        });
        bulider.setNegativeButton("cancel", null).setCancelable(false);
        AlertDialog alert = bulider.create();
        alert.show();
    }
    *
     */

}
    }



