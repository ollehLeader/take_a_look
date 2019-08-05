package com.example.djqjd.takealookdemo.project;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ansan on 2017-11-01.
 */
/*
1. 클래스를 새로 만든다.(MovieAdapter)
2. BaseAdapter를 상속받는다.
3. 필요한 메소드를 overriding한다.
4. context와 데이터를 선언한다.
5. 생성자를 만든다.
 */
public class MovieAdapter extends BaseAdapter {

    Context context;

    ArrayList<Movie> movies;

    MovieAdapter(Context context, ArrayList<Movie> movies){
        this.context = context;
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View onemovie = View.inflate(context,R.layout.onemovie,null);

        TextView tv1 = (TextView)onemovie.findViewById(R.id.tvMovie);
        TextView tv2 = (TextView)onemovie.findViewById(R.id.tvName);

        Movie one = movies.get(position);

        tv1.setText(one.getName());

        tv2.setText(one.getPerson());
        return onemovie;
    }
}