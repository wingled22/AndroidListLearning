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

        //create product object
        Product prod1 = new Product("Product 1", "Sample description", "100");
        Product prod2 = new Product("Product 2", "Sample description", "100");
        Product prod3 = new Product("Product 3", "Sample description", "100");
        Product prod4 = new Product("Product 4", "Sample description", "100");
        Product prod5 = new Product("Product 5", "Sample description", "100");
        Product prod6 = new Product("Product 6", "Sample description", "100");
        Product prod7 = new Product("Product 7", "Sample description", "100");
        Product prod8 = new Product("Product 8", "Sample description", "100");
        Product prod9 = new Product("Product 9", "Sample description", "100");
        Product prod10 = new Product("Product 10", "Sample description", "100");
        Product prod11 = new Product("Product 11", "Sample description", "100");
        Product prod12 = new Product("Product 12", "Sample description", "100");
        Product prod13 = new Product("Product 13", "Sample description", "100");
        Product prod14 = new Product("Product 14", "Sample description", "100");
        Product prod15 = new Product("Product 15", "Sample description", "100");
        Product prod16 = new Product("Product 16", "Sample description", "100");

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

        ProductListAdapter productListAdapter = new ProductListAdapter(this,R.layout.product_list,productsList);
        listView.setAdapter(productListAdapter);
    }
}