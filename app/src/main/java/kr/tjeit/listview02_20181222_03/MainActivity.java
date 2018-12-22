package kr.tjeit.listview02_20181222_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.tjeit.listview02_20181222_03.datas.Store;

public class MainActivity extends BaseActivity {

    ListView storeListView;
    List<Store> storeList = new ArrayList<Store>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }


    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        fillStores();
    }

//    가게 데이터를 채우기 위한 임시 메소드
    void fillStores(){
        storeList.clear();

        storeList.add(new Store("BBQ","종로구 10길", 4, "오후 2:00 ~ 오전 1:00", "01012345678"));
        storeList.add(new Store("네네치킨","종로구 1길", 4, "오후 2:00 ~ 오전 4:00", "01098765418"));
        storeList.add(new Store("노랑통닭","종로구 12길", 4, "오후 2:00 ~ 오전 2:00", "01012345123"));
        storeList.add(new Store("디디치킨","종로구 4길", 4, "오후 2:00 ~ 오전 1:00", "01012654678"));
        storeList.add(new Store("BHC","종로구 8길", 4, "오후 4:00 ~ 오전 1:00", "01012345678"));
        storeList.add(new Store("교촌치킨","종로구 22길", 4, "오후 5:00 ~ 오전 1:00", "01014567678"));
        storeList.add(new Store("굽네치킨","종로구 7길", 4, "오후 6:00 ~ 오전 2:00", "01045675678"));

    }


    @Override
    public void bindViews() {
        storeListView = findViewById(R.id.storeListView);
    }
}
