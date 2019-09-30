package info.androidhive.materialtabs.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.adapter.ListViewAdapter;
import info.androidhive.materialtabs.item.ListViewItem;


public class OneFragment extends ListFragment {

    ListViewAdapter adapter ;

    public OneFragment() {
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

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0804540),
                "택시4", "평점: 5.6") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0848228),
                "어벤져스엔드게임", "평점: 8.5") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt1078912),
                "박물관이살아있다2", "평점: 6.0") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt6146586),
                "존윅3파라벨룸", "평점: 7.7") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt6911608),
                "맘마미아2", "평점: 6.7") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt7160070),
                "신과함께죄와벌", "평점: 7.3") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0107290),
                "쥬라기월드", "평점: 8.4") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt2446042),
                "테이큰3", "평점: 6.0") ;

        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0188453),
                "", "") ;




        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
