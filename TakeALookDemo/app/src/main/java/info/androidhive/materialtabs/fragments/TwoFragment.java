package info.androidhive.materialtabs.fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.adapter.ListViewAdapter;
import info.androidhive.materialtabs.item.ListViewItem;


public class TwoFragment extends ListFragment {

    ListViewAdapter adapter ;

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        // get TextView's Text.
        ListViewItem item = (ListViewItem) l.getItemAtPosition(position) ;

        String titleStr = item.getTitle() ;
        String descStr = item.getDesc() ;
        Drawable iconDrawable = item.getIcon() ;

        // TODO : use item data.
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Adapter 생성 및 Adapter 지정.
        adapter = new ListViewAdapter() ;
        setListAdapter(adapter) ;


        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0306047),
                "무서운영화3", "평점 : 5.5") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt6139732	),
                "알라딘", "평점 : 7.5") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt2097307),
                "뺑빤", "평점 : 6.1") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0483607),
                "둠스데이2018", "평점 : 6.5") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0482599),
                "셔터", "평점 : 5.2") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt2473682	),
                "파라노말액티비티더마트드원스", "평점 : 5.0") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0462538),
                "심슨가족, 더무비", "평점 : 7.3") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0107978),
                "로보캅3", "평점 : 4.1") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt2660888),
                "스타트렉비욘드", "평점 : 7.1") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0901487),
                "좋은놈,나쁜놈,이상한놈", "평점 : 7.3") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt2510894),
                "몬스터호텔", "평점 : 6.7") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0188453),
                "버스데이걸", "평점 : 6.1") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0188453),
                "", "") ;



        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
