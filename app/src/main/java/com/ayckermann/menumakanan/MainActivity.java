package com.ayckermann.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);

        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Stewed Pork Ramen", "Soft, juicy stewed pork with pork broth",R.drawable.stewedpork,"Rp. 56000"));
        listMakanan.add(new Makanan("Shabu Beef Ramen", "Beef slices with pork broth",R.drawable.shabubeef,"Rp. 60000"));
        listMakanan.add(new Makanan("Naruto Chasu Ramen", "Sliced flavored pork and fish cake with pork broth",R.drawable.naruto,"Rp. 50000"));
        listMakanan.add(new Makanan("Seafood Ramen", "Grilled salmon, shrimp, mussel, squid ball with pork broth",R.drawable.seafood,"Rp. 70000"));
        listMakanan.add(new Makanan("Vegetable Ramen", "Pan stir fired veggies and tofu with pork broth or vegetarian soup",R.drawable.veggies,"Rp. 45000"));
        listMakanan.add(new Makanan("Fried Chicken Ramen", "Deep fried curry flavored chicken with pork broth",R.drawable.chicken,"Rp. 45000"));

    }
}