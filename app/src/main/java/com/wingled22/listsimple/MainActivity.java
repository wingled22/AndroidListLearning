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
        ListView orderListView = findViewById(R.id.orderlistview);

        ArrayList<String> stringList = new ArrayList<>() ;

        //create product object
        Product prod1 = new Product(1,"Product 1", "Sample description", "100");
        Product prod2 = new Product(2,"Product 2", "Sample description", "100");
        Product prod3 = new Product(3,"Product 3", "Sample description", "100");
        Product prod4 = new Product(4,"Product 4", "Sample description", "100");
        Product prod5 = new Product(5,"Product 5", "Sample description", "100");
        Product prod6 = new Product(6,"Product 6", "Sample description", "100");
        Product prod7 = new Product(7,"Product 7", "Sample description", "100");
        Product prod8 = new Product(8,"Product 8", "Sample description", "100");
        Product prod9 = new Product(9,"Product 9", "Sample description", "100");
        Product prod10 = new Product(10,"Product 10", "Sample description", "100");
        Product prod11 = new Product(11,"Product 11", "Sample description", "100");
        Product prod12 = new Product(12,"Product 12", "Sample description", "100");
        Product prod13 = new Product(13,"Product 13", "Sample description", "100");
        Product prod14 = new Product(14,"Product 14", "Sample description", "100");
        Product prod15 = new Product(15,"Product 15", "Sample description", "100");
        Product prod16 = new Product(16,"Product 16", "Sample description", "100");
        Product prod17 = new Product(17,"Product 17", "Sample description", "100");
        Product prod18 = new Product(18,"Product 18", "Sample description", "100");
        Product prod19 = new Product(19,"Product 19", "Sample description", "100");
        Product prod20 = new Product(20,"Product 20", "Sample description", "100");


        //add the objects to the arraylist of products
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(prod1);
        productsList.add(prod2);
        productsList.add(prod3);
        productsList.add(prod4);
        productsList.add(prod5);
        productsList.add(prod6);
        productsList.add(prod7);
        productsList.add(prod8);
        productsList.add(prod9);
        productsList.add(prod10);
        productsList.add(prod11);
        productsList.add(prod12);
        productsList.add(prod13);
        productsList.add(prod14);
        productsList.add(prod15);
        productsList.add(prod16);
        productsList.add(prod17);
        productsList.add(prod18);
        productsList.add(prod19);
        productsList.add(prod20);

        ProductListAdapter productListAdapter = new ProductListAdapter(this,R.layout.product_list,productsList);
        listView.setAdapter(productListAdapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String positionString = String.valueOf(position);



                Product product = (Product) parent.getItemAtPosition(position);

                stringList.add("ID: "+ product.getId()+". Name: "+product.getName());

                ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, stringList);
                orderListView.setAdapter(arrayAdapter);


                Toast toast =  Toast.makeText(MainActivity.this, "ID: "+ product.getId()+". Name: "+product.getName(), Toast.LENGTH_SHORT ) ;
                toast.show();

            }
        });
    }
}