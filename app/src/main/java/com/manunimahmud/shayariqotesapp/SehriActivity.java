package com.manunimahmud.shayariqotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SehriActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private List<SehriModel> list;
    private int cat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sehri);
        recycler = findViewById(R.id.recycler);

        cat = getIntent().getIntExtra("cat",1);
        switch (cat){
            case 1:
                initList();
                break;
            case 2:
                initList2();
                break;
            case 3:
                initList3();
                break;
            case 4:
                initList4();
                break;
            case 5:
                initList5();
                break;
            case 6:
                initList6();
                break;
            case 7:
                initList7();
                break;
            case 8:
                initList8();
                break;
        }


        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new SehriAdapter(this,list));
    }
    private void initList(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mahmudul Islam. Whats your name?"));
    }
    private void initList2(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Mamun Islam. Whats your name?"));
    }
    private void initList3(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Nasima Islam. Whats your name?"));
    } private void initList4(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Fatima Islam. Whats your name?"));
    } private void initList5(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Yousuf Islam. Whats your name?"));
    } private void initList6(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Bappi Islam. Whats your name?"));
    } private void initList7(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Toma Islam. Whats your name?"));
    } private void initList8(){
        list = new ArrayList<>();
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
        list.add(new SehriModel("Hello I am Tuli Islam. Whats your name?"));
    }
}