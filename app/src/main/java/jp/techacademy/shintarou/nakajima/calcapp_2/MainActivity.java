package jp.techacademy.shintarou.nakajima.calcapp_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* +ボタン */
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        /* -ボタン */
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        /* xボタン */
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        /* ボタン */
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        //EditTextのメンバ変数の設定
        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        //Buttonのメンバ変数の設定

    }

    @Override
    /*
    ・どのボタンが押されたかを判定するif文？　それともSecondActivity.javaにて判定？
    ・値をSecondActivityへIntent？
    */
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        //VALUE1のvalueは、一個目入力EditTextの値
        intent.putExtra("VALUE1", mEditText1.getText().toString());
        //VALUE2のvalueは、個目入力EditTextの値
        intent.putExtra("VALUE2", mEditText2.getText().toString());
        //VALUE3のvalueは、どのボタンを押したか　＊先ずはこれは無視して足し算だけ
        //intent.putExtra("VALUE3", );
        startActivity(intent);
    }
}
