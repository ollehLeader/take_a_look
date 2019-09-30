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


public class ThreeFragment extends ListFragment {

    ListViewAdapter adapter ;

    public ThreeFragment() {
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
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt5463162),
                "데드풀", "평점: 7.7") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0338309),
                "말레피센트", "평점: 7.8") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt1951265),
                "헝거게임 모킹제이", "평점: 6.6") ;

        /*adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.tt0188453),
                "", "") ;*/


        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
