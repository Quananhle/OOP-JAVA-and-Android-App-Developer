package com.example.stockwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView stockData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stockData = findViewById(R.id.stockData);

    }
    public void getData(View v){
        DataGetter dataGetter = new DataGetter(this);
        Thread t = new Thread(dataGetter);
        t.start();
    }
    public void receiveData(String s){

    }
}