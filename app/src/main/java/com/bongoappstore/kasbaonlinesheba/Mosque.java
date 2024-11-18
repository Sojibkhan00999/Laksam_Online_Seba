package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Mosque extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_mosque);
        getSupportActionBar().setTitle("কসবা উপজেলা মসজিদ এর তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//


        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_01);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_08);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_10);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_11);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_12);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_13);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_14);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_15);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_16);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_17);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_18);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_19);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_20);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_21);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_22);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_23);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_24);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_25);
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("mosque_name_text", R.string.mosque_name_text_26);
        arrayList.add(hashMap);



        //==========================================================================================
        //==========================================================================================
        Mosque.MyAdapter myAdapter = new Mosque.MyAdapter();
        listView.setAdapter(myAdapter);


    } //------------------------OnCreate Bundle Method Line End Here

    //-----------------------Create My Own Adapter Line Start Here-------------------------------------//
    public class MyAdapter extends BaseAdapter {

        LayoutInflater layoutInflater;

        @Override
        public int getCount() {
            // return 1;
            return arrayList.size();

        }


        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        //=========================================================================================//


        //=========================================================================================//


        @SuppressLint("ResourceType")
        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {


            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.mosque_item_design, viewGroup, false);


            TextView all_sub_textview = myView.findViewById(R.id.hat_bazar_name_text);




            HashMap<String, Integer> hashMap = arrayList.get(position);

            all_sub_textview.setText(hashMap.get("mosque_name_text"));


            return myView;


        }

    } //-----------------------Create My Own Adapter Line End Here-------------------------------------//



    @Override //=================Back Button 2nd Codding Line Start Here=====================//
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    } //========================Back Button 2nd Codding End Line Here======================= //








} //-------------------Primary_School Method Line End Here}