package com.recyclerv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background, "Line 1", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Line 2", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Line 3", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Line 4", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.circle, "Line 5", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.circle, "Line 6", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.circle, "Line 7", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.circle, "Line 8", "Line 2"));
        exampleList.add(new ExampleItem(R.drawable.circle, "Line 9", "Line 2"));



        mRecyclerView = findViewById(R.id.recycler);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
}
