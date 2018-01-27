package com.example.student.a20180127_03adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    ArrayList<String> mylist = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        // String data[] = {"香蕉", "蘋果", "柳丁", "鳳梨"};
        mylist.add("蘋果");
        mylist.add("香蕉");
        mylist.add("鳳梨");
        mylist.add("番茄");
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mylist);               //把 data 改成 mylist
        sp.setAdapter(adapter);
    }

    public void click1(View v){
        EditText ed = findViewById(R.id.editText);
        mylist.add(ed.getText().toString());
    }
    public void click2 (View v){
        mylist.remove(sp.getSelectedItemPosition());
        adapter.notifyDataSetChanged();
    }
}
