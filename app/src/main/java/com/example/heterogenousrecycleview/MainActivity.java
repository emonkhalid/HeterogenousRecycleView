package com.example.heterogenousrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Object>objectArrayList;
    private ObjectAdapter objectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        objectArrayList = new ArrayList<>();

        objectArrayList.add(new Mobile("Pixel 3", "Google Pixel 3", "Google", R.drawable.mobile, 2018));
        objectArrayList.add(new Movie("Origin of Wolverine", R.drawable.movie));
        objectArrayList.add(new Mobile("iPhone 8", "iPhone 8x", "Apple", R.drawable.mobile, 2018));
        objectArrayList.add(new Movie("Spiderman", R.drawable.movie));
        objectArrayList.add(new Mobile("Pixel-3", "Google Pixel", "Google", R.drawable.mobile, 2018));
        objectArrayList.add(new Movie("Batman", R.drawable.movie));
        objectArrayList.add(new Movie("Titanic", R.drawable.movie));
        objectArrayList.add(new Mobile("Mi 10", "Xiaomi Mi 10", "Xiaomi ", R.drawable.mobile, 2018));

        objectAdapter = new ObjectAdapter(this, objectArrayList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(objectAdapter);





    }
}
