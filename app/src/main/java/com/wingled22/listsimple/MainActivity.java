package com.wingled22.listsimple;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        String[] stringList = {"list 1", "list 2", "list 3", "list 4", "list 5"};

        ArrayList<String> itemArrayList = new ArrayList<>();

        for(int i = 0;i< stringList.length;i++){
            itemArrayList.add(stringList[i]);
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, itemArrayList);
        listView.setAdapter(arrayAdapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String positionString = String.valueOf(position);
                String positionString = (String)parent.getItemAtPosition(position);
                Toast toast =  Toast.makeText(getApplicationContext(), positionString, Toast.LENGTH_SHORT ) ;
                toast.show();

//                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
//                builder.setMessage(positionString)
//                        .setTitle("You click Somthing!");
//                AlertDialog dialog = builder.create();
            }
        });
    }
}