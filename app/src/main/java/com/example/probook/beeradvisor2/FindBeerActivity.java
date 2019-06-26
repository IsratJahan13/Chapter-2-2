package com.example.probook.beeradvisor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeer(View view){
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
        List<String> brandlist = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandlist){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
