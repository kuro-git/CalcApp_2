package jp.techacademy.shintarou.nakajima.calcapp_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double value1 = intent.getDoubleExtra("VALUE1",0);
        double value2 = intent.getDoubleExtra("VALUE2",0);
        //どのボタンか判定する値
        int value3 = intent.getIntExtra("VALUE3", 0);

        //先ずは足し算だけ
        /*TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value1 + value2));*/

        //どのボタンが押されたかを判定するif文

        if (value3 == 0) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 + value2));
        }else if (value3 == 1) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 - value2));
        }else if (value3 == 2) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 * value2));
        }else if (value3 == 3) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(String.valueOf(value1 / value2));
        }


    }
}
