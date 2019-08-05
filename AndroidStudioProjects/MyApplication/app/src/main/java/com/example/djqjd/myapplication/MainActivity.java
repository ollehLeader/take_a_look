package com.example.djqjd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    MovieAdapter adapter;
    ListView listView;
    EditText e2,e3;
    Button b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        b2 = (Button)findViewById(R.id.b2);

        movies.add(new Movie("비열한 거리","조인성")); //movies.add("미션 임파서블") 이런식으로도 가능
        movies.add(new Movie("택시운전사","송강호"));
        movies.add(new Movie("공조","현빈"));
        movies.add(new Movie("밀정","공유"));

        adapter = new MovieAdapter(this,movies);

        listView  = (ListView)findViewById(R.id.listview3);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                movies.remove(position); // 해당번호 (position)의 데이터를 삭제 한다
                adapter.notifyDataSetChanged();//2. 어댑터에게 데이터가 변경되었다고 알려준다.
                Toast.makeText(getApplicationContext(),"삭제되었습니다",Toast.LENGTH_SHORT).show(); //3."삭제되었습니다." 토스트를 띄운다
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = movies.get(position).getName();
                Toast.makeText(getApplicationContext(),title + "가 선택되었습니다",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newmovie = e2.getText().toString();  //1.EditText에서 입력한 글자를 가져온다.
                String newperson = e3.getText().toString(); //2. 데이터를 추가한다.
                movies.add(new Movie(newmovie,newperson)); //movies.add(newmovie);
                adapter.notifyDataSetChanged();
                e2.setText(""); //4.EditText 글자를 지운다.
                e3.setText("");
            }
        });
    }
}


