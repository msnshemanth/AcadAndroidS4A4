package com.example.hemanth.s4assign4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;

    String[] web ={"GingerBread","HoneyComb","IcecreamSandwich","JellyBean","Kitkat","Lollypop" };
    int[] imageId={R.mipmap.gingerbread,
            R.mipmap.honeycomb,
            R.mipmap.icecreamsandwich,
            R.mipmap.jellybean,
            R.mipmap.kitkat,
            R.mipmap.lollypop1,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}