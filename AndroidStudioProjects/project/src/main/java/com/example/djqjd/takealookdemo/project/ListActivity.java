package com.example.djqjd.takealookdemo.project;

import android.content.DialogInterface;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.ListView;
import android.widget.Toast;
import android.app.TabActivity;

import java.util.ArrayList;


public class ListActivity extends TabActivity {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    MovieAdapter adapter;
    ListView listView1, listView2, listView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TabHost tabHost = getTabHost();

        TabSpec tabSpecSong = tabHost.newTabSpec("Like").setIndicator("Like");
        tabSpecSong.setContent(R.id.tabLike);
        tabHost.addTab(tabSpecSong);

        TabSpec tabSpecArtist = tabHost.newTabSpec("Hate")
                .setIndicator("Hate");
        tabSpecArtist.setContent(R.id.tabHate);
        tabHost.addTab(tabSpecArtist);

        TabSpec tabSpecAlbum = tabHost.newTabSpec("Interest").setIndicator("Interest");
        tabSpecAlbum.setContent(R.id.tabInter);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);


        /*listView1 = (ListView)findViewById(R.id.listview1);
        listView2 = (ListView)findViewById(R.id.listview2);
        listView3 = (ListView)findViewById(R.id.listview3);


        //데이터 만들기
        movies.add(new Movie("비열한 거리","조인성"));
        movies.add(new Movie("택시운전사","송강호"));

        //어댑터 완성
        adapter = new MovieAdapter(this,movies);
        listView1  = (ListView)findViewById(R.id.listview1);
        listView1.setAdapter(adapter);
        //선택 시
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = movies.get(position).getName();
                Toast.makeText(getApplicationContext(),title + "가 선택되었습니다",Toast.LENGTH_SHORT).show();
            }
        });
        // 롱클릭하였을때 삭제 탭 나오기
        listView1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(ListActivity.this);
                dlg.setMessage(movies.get(position) + "를 삭제하시겠습니까?");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("삭제", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //1. 데이터에서 삭제
                        movies.remove(position);

                        //2. 어댑터에 통보
                        adapter.notifyDataSetChanged();
                    }
                });
                dlg.setNegativeButton("취소", null);
                dlg.show();
                return false;
            }
        });

        /*b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //1. 에디더텍스트에 입력한 동물이름 가져오기
                String one = et1.getText().toString();

                //2. 리스트뷰에 추가하기
                //2-1. 데이터에 추가하기
                movies.add(one);

                //2-2. 어댑터에 통보하기
                adapter.notifyDataSetChanged();  //버튼 클릭시 데이터를 넘기는 것

            }
        }); */

    }
}
