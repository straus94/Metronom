package com.example.test.metronom;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBPM;
    ImageButton btnPlus;
    ImageButton btnMinus;
    SeekBar seekBar;
    Button btnStart;
    int count;
    double speed;

    MetronomeAsyncTask metroTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar = (SeekBar) findViewById(R.id.seekBar);

        btnStart = (Button) findViewById(R.id.btn_start);

        tvBPM = (TextView) findViewById(R.id.tv_bpm);
        tvBPM.setText(String.valueOf(seekBar.getProgress() + " bpm"));

        btnPlus = (ImageButton) findViewById(R.id.btn_plus);
        btnMinus = (ImageButton) findViewById(R.id.btn_minus);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvBPM.setText(String.valueOf(progress + " bpm"));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void clickStart(View v){

    }

    public void changeMinus(View v){
        seekBar.setProgress(seekBar.getProgress() - 1);

    }
    public void changePlus(View v){
        seekBar.setProgress(seekBar.getProgress() +1);
    }

    private class MetronomeAsyncTask extends AsyncTask<Void, Void, String>{

        @Override
        protected String doInBackground(Void... params) {
            return null;
        }
    }

}
