package com.wingled22.listsimple;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {
    private static final String TAG = "ProductListAdapter";
    private Context context;
    private int mresource;

   public ProductListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get product information
        String name = getItem(position).getName();
        String desc = getItem(position).getDescription();
        String price = getItem(position).getPrice();

        //create a product object with the product information
        Product product = new Product(name,desc, price);

        //use this code for best performance
        if(convertView == null){
            //create a layout inflater
            LayoutInflater inflater =  LayoutInflater.from(context);
            convertView = inflater.inflate(mresource,parent, false  );
        }
        //declare textfield object from the view
        TextView nameTF = (TextView) convertView.findViewById(R.id.prodName);
        TextView descTF = (TextView) convertView.findViewById(R.id.prodDesc);
        TextView priceTF = (TextView) convertView.findViewById(R.id.prodPrice);

        nameTF.setText(name);
        descTF.setText(desc);
        priceTF.setText(price);
        return convertView;


//        return convertView;
    }
}
