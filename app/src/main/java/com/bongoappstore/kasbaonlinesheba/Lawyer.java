package com.bongoappstore.kasbaonlinesheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import de.hdodenhof.circleimageview.CircleImageView;

public class Lawyer extends AppCompatActivity {

    ListView listView;

    ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
    HashMap<String, Integer> hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.purple_500));
        setContentView(R.layout.activity_lawyer);
        getSupportActionBar().setTitle("আইনজীবীদের তালিকা");

        //==============================Back Button 1st Code Line Start Here======================//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //==============================Back Button 1st Code Line End Here========================//

        listView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_01);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_01);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_02);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_02);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_03);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_03);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_04);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_04);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_05);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_05);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_06);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_06);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_07);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_07);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_08);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_08);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_09);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_09);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_10);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_10);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_11);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_11);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_12);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_12);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_13);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_13);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_14);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_14);
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("lawer_name_text", R.string.lawer_name_text_15);
        hashMap.put("lawer_name_details_text", R.string.lawer_name_details_text_15);
        arrayList.add(hashMap);


        //==========================================================================================
        //==========================================================================================

        Lawyer.MyAdapter myAdapter = new Lawyer.MyAdapter();
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
            View myView = layoutInflater.inflate(R.layout.activity_custom_item_design, viewGroup, false);


            TextView all_headline_text = myView.findViewById(R.id.all_headline_text);
            TextView all_sub_headline_text = myView.findViewById(R.id.all_sub_headline_text);


            //-----------------------Sim Image List Line Start Here-----------------//

            CircleImageView sim_company_name_image = myView.findViewById(R.id.sim_company_name_image);

            if (position == 0) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 1) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 2) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 3) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 4) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 5) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 6) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 7) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 8) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 9) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }

            if (position == 10) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }


            if (position == 11) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }


            if (position == 12) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }


            if (position == 13) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }


            if (position == 14) {

                sim_company_name_image.setImageResource(R.drawable.lawyer_icon);

            }


            //-----------------------Sim Image List Line End Here-----------------//


            LinearLayout call_image_layout = myView.findViewById(R.id.call_image_layout);




//==================================================================================================
//=====================Button OnClick Listener Coding Start=========================================
//==================================================================================================

            call_image_layout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (position == 0) {

                        String phoneNumber = "01728-823714";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 1) {

                        String phoneNumber = "01679-878216";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 2) {

                        String phoneNumber = "01715-499148";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 3) {

                        String phoneNumber = "01777-783499";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 4) {

                        String phoneNumber = "01711-129215";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 5) {

                        String phoneNumber = "01923-427372";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 6) {

                        String phoneNumber = "01712-924324";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 7) {

                        String phoneNumber = "01787-398346";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 8) {

                        String phoneNumber = "01727-278833";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 9) {

                        String phoneNumber = "01726-923304";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                    if (position == 10) {

                        String phoneNumber = "01710-238001";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 11) {

                        String phoneNumber = "01719-353224";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 12) {

                        String phoneNumber = "01711-371269";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 13) {

                        String phoneNumber = "01712-077946";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }

                    if (position == 14) {

                        String phoneNumber = "01717-9314252";
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:" + phoneNumber));
                        startActivity(intent);
                    }


                }
            });

//==================================================================================================
//=====================Button OnClick Listener Coding End===========================================
//==================================================================================================


            HashMap<String, Integer> hashMap = arrayList.get(position);


            all_headline_text.setText(hashMap.get("lawer_name_text"));
            all_sub_headline_text.setText(hashMap.get("lawer_name_details_text"));


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


} //------------------------Lawyer Method Line End Here