package com.example.djqjd.takealookdemo.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tal_signActivity extends AppCompatActivity {
    // 첫 로그인 화면

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tal_sign);
        setTitle("sign test");

        TextView edt_input_id, edt_input_pw;
        Button btn_sign, btn_account;

        edt_input_id = (TextView) findViewById(R.id.edt_input_id);
        edt_input_pw = (TextView) findViewById(R.id.edt_input_pw);

        btn_sign = (Button) findViewById(R.id.btn_sign);
        btn_account = (Button) findViewById(R.id.btn_account);

        btn_sign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tal_mainActivity.class);
                startActivity(intent);
                // 화면 전환 인텐트
            }
        });

        btn_account.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 아직 미구현
            }
        });
    }
}
