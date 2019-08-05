package com.example.djqjd.takealookdemo.project;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRcmd, btnList, btnRank, btnOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnList = (Button)findViewById(R.id.btnList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view){
                Intent intent = new Intent (
                        getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
