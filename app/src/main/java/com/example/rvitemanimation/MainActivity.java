package com.example.rvitemanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView NewsRecyclerview;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;
    EditText searchInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Pantalla completa

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();



        setContentView(R.layout.activity_main);

        // ini view

        NewsRecyclerview = findViewById(R.id.news_rv);

        searchInput=findViewById(R.id.search_input);
        mData = new ArrayList<>();


        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                newsAdapter.getFilter().filter(s);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        // Fill List news With Data


        mData.add(new NewsItem("DVR 01","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ","20/12/20",R.drawable.img_01));
        mData.add(new NewsItem("DVR 02","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_02));
        mData.add(new NewsItem("DVR 03","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_03));
        mData.add(new NewsItem("DVR 04","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_04));
        mData.add(new NewsItem("DVR 05","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_05));
        mData.add(new NewsItem("DVR 06","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_06));
        mData.add(new NewsItem("DVR 07","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_07));
        mData.add(new NewsItem("DVR 08","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_08));
        mData.add(new NewsItem("DVR 09","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_09));
        mData.add(new NewsItem("DVR 10","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_10));
        mData.add(new NewsItem("DVR 11","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_11));
        mData.add(new NewsItem("DVR 12","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s","20/12/20",R.drawable.img_12));


        //Adapter ini and Setup

        newsAdapter = new NewsAdapter(this,mData);
        NewsRecyclerview.setAdapter(newsAdapter);
        NewsRecyclerview.setLayoutManager(new LinearLayoutManager(this));

    }
}

///9:55 https://www.youtube.com/watch?v=ess7Ql_H9V0&t=634s
